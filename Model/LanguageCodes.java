package Model;

public enum LanguageCodes {
    ENGLISH("en", "Hello World"),
    PERSIAN("fa", "سلام، جهان!"),
    FRENCH("fr", "Bonjour le monde!"),
    SPANISH("es", "¡Hola Mundo!");

    private final String key;
    private final String greeting;

    LanguageCodes(String key, String greeting) {
        this.key = key;
        this.greeting = greeting;
    }

    public String getKey() {
        return key;
    }

    public String getGreeting() {
        return greeting;
    }

    public static LanguageCodes findByKey(String key) {
        for (LanguageCodes code : values()) {
            if (code.getKey().equals(key)) {
                return code;
            }
        }
        return null;
    }

    public static String getSupportedLanguages() {
        StringBuilder languages = new StringBuilder();

        for (LanguageCodes code : LanguageCodes.values()) {
            languages.append("'").append(code.getKey()).append("' for ").append(code.name()).append(", ");
        }

        if (languages.length() > 2) {
            languages.setLength(languages.length() - 2);
        }

        return languages.toString();
    }
}
