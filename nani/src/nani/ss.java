package nani;

import java.util.HashSet;
import java.util.Set;

public class ss {

    public static void main(String[] args) {
        String str = "nagendra";
        char[] arr = str.toCharArray();
        Set<Character> set = new HashSet<>();

        // Add each character to the set
        for (char a : arr) {
            set.add(a);
        }

        // Use StringBuffer to construct the result string
        StringBuffer sb = new StringBuffer();
        for (char c : set) {
            sb.append(c);
        }

        // Print the result string without duplicates
        System.out.println("String without duplicates: " + sb.toString());

        // Finding and printing duplicate characters
        System.out.print("Duplicate characters: ");
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.print(str.charAt(i) + " ");
                    break; // Break inner loop to avoid multiple prints of the same duplicate
                }
            }
        }
    }
}
