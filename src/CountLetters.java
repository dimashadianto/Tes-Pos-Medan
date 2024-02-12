import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public static String countLetters(String input) {
        String lowerCaseInput = input.toLowerCase();

        Map<Character, Integer> countMap = new HashMap<>();

        for (char c : lowerCaseInput.toCharArray()) {
            if (c != ' ') {
                countMap.put(c, countMap.getOrDefault(c, 0) + 1);
            }
        }

        StringBuilder result = new StringBuilder();
        for (Map.Entry<Character, Integer> entry : countMap.entrySet()) {
            result.append(entry.getKey()).append('=').append(entry.getValue()).append(", ");
        }

        if (result.length() > 0) {
            result.delete(result.length() - 2, result.length());
        }

        return result.toString();
    }
}
