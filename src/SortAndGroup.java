import java.util.HashMap;
import java.util.Map;

public class SortAndGroup {
    public static String sortAndGroup(String[] words) {
        Map<Character, Integer> charCount = new HashMap<>();

        for (String word : words) {
            for (char c : word.toCharArray()) {
                charCount.put(c, charCount.getOrDefault(c, 0) + 1);
            }
        }

        StringBuilder result = new StringBuilder();
        while (!charCount.isEmpty()) {
            char maxChar = 0;
            int maxCount = -1;
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                if (entry.getValue() > maxCount) {
                    maxCount = entry.getValue();
                    maxChar = entry.getKey();
                } else if (entry.getValue() == maxCount && entry.getKey() < maxChar) {
                    maxChar = entry.getKey();
                }
            }

            result.append(maxChar);
            charCount.remove(maxChar);
        }

        return result.toString();
    }
}
