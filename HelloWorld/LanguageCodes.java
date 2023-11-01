package HelloWorld;

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

    // اگر مایل به دریافت Enum بر اساس کلید باشید:
    public static LanguageCodes findByKey(String key) {
        for (LanguageCodes code : values()) {
            if (code.getKey().equals(key)) {
                return code;
            }
        }
        return null;
    }
}
