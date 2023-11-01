package HelloWorld;

import java.util.HashMap;
import java.util.Map;

public class Greetings {

    public static Map<String, String> getGreetingsMap() {
        Map<String, String> greetingsMap = new HashMap<>();

        for (LanguageCodes code : LanguageCodes.values()) {
            greetingsMap.put(code.getKey(), code.getGreeting());
        }

        return greetingsMap;
    }

    public static String getGreetingByLanguageCode(String languageCode) {
        LanguageCodes code = LanguageCodes.findByKey(languageCode);

        if (code != null) {
            return code.getGreeting();
        } else {
            return "Language not supported.";
        }
    }

}
