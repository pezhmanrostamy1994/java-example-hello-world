package Controller;

import Model.LanguageCodes;
import View.GreetingView;
import java.util.Scanner;

public class GreetingController {

    private final GreetingView view;
    private final Scanner scanner;

    public GreetingController(GreetingView view) {
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void getUserInputAndDisplayGreeting() {
        System.out.println("Please enter a valid language code (e.g., " + LanguageCodes.getSupportedLanguages() + "):");
        
        String languageCode = scanner.nextLine().trim().toLowerCase();

        // بررسی ورودی خالی
        if (languageCode.isEmpty()) {
            view.displayGreeting("No language code entered. Please try again.");
            return;
        }

        String greeting = getGreetingByLanguageCode(languageCode);
        view.displayGreeting(greeting);
    }

    private String getGreetingByLanguageCode(String languageCode) {
        LanguageCodes code = LanguageCodes.findByKey(languageCode);

        if (code != null) {
            return code.getGreeting();
        } else {
            return "Language not supported. Please enter a valid code.";
        }
    }
}
