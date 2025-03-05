package java8praice;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
        	 String s="a";
             s = reader.readLine().trim(); // Read input and trim whitespace
            System.out.println(Decrypting(s)); // Call the Decrypting method and print the result
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int Decrypting(String s) {
        // Edge case: Empty string
        if (s == null || s.isEmpty()) {
            return -1;
        }

        // Create a map to store the frequency of each character
        Map<Character, Integer> frequencyMap = new HashMap<>();

        // First pass: Count the frequency of each character
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Second pass: Find the first character with a frequency of 1
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i; // Return index of the first non-repeating character
            }
        }

        // No non-repeating character found
        return -1;
    }
}