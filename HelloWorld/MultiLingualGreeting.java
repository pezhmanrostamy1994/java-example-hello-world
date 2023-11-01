package HelloWorld;

import java.util.Scanner;

public class MultiLingualGreeting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the language code (e.g., " + LanguageCodes.getSupportedLanguages() + "):");
        String languageCode = scanner.nextLine().trim().toLowerCase();

        String greeting = Greetings.getGreetingByLanguageCode(languageCode);
        System.out.println(greeting);

        scanner.close();
    }

}
