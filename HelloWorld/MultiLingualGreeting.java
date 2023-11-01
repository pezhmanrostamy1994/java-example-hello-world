package HelloWorld;

import java.util.Scanner;

public class MultiLingualGreeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the language code (e.g., " + getSupportedLanguages() + "):");
        String languageCode = scanner.nextLine().trim().toLowerCase();

        String greeting = Greetings.getGreetingByLanguageCode(languageCode);
        System.out.println(greeting);

        scanner.close();
    }

    public static String getSupportedLanguages() {
        StringBuilder languages = new StringBuilder();

        for (LanguageCodes code : LanguageCodes.values()) {
            languages.append("'").append(code.getKey()).append("' for ").append(code.name()).append(", ");
        }

        // Removing last ", " for better formatting
        if (languages.length() > 2) {
            languages.setLength(languages.length() - 2);
        }

        return languages.toString();
    }
}
