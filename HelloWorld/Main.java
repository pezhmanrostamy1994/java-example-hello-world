package HelloWorld;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the language code (e.g., 'en' for English, 'fa' for Persian):");
        String languageCode = scanner.nextLine();

        System.out.println(Greetings.getGreeting(languageCode));
    }
}
