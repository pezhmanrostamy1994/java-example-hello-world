package HelloWorld;

import java.util.HashMap;
import java.util.Map;

public class Greetings {

    private static final Map<String, String> greetingsMap = new HashMap<>();

    static {
        greetingsMap.put("en", "Hello, World!");
        greetingsMap.put("fa", "سلام، جهان!");
        greetingsMap.put("fr", "Bonjour le monde!");
        greetingsMap.put("es", "¡Hola Mundo!");
        // ... اضافه کردن زبان‌های دیگر
    }

    public static String getGreeting(String languageCode) {
        return greetingsMap.getOrDefault(languageCode, "Hello, World!");
    }
}
