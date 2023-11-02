package Controller;

import Model.LanguageCodes;
import View.GreetingView;
import java.util.Scanner;

public class GreetingController {

    private GreetingView view;
    private Scanner scanner;

    public GreetingController(GreetingView view) {
        this.view = view;
        this.scanner = new Scanner(System.in);
    }

    public void getUserInputAndDisplayGreeting() {
        System.out.println("Please enter the language code (e.g., " + LanguageCodes.getSupportedLanguages() + "):");
        String languageCode = scanner.nextLine().trim().toLowerCase();

        String greeting = getGreetingByLanguageCode(languageCode);
        view.displayGreeting(greeting);
    }

    private String getGreetingByLanguageCode(String languageCode) {
        LanguageCodes code = LanguageCodes.findByKey(languageCode);

        if (code != null) {
            return code.getGreeting();
        } else {
            return "Language not supported.";
        }
    }
}
