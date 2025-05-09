package frequently;

import java.util.HashMap;
import java.util.Map;

public class MapString {
    public static void main(String[] args) {
        String str = "nagendraa";
        Map<Character, Integer> charCountMap = new HashMap<>();
        
        for (int i = 0; i < str.length(); i++) {
            char lowercaseC = str.charAt(i);
            charCountMap.put(lowercaseC, charCountMap.getOrDefault(lowercaseC, 0) + 1);
        }

        // Printing the frequency of characters in the string
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.print(entry.getKey() + ":" + entry.getValue() + " ");
        }
    }
}
