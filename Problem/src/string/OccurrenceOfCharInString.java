package string;

// Java program to count frequencies of
// characters in string using Hashmap
import java.io.*;
import java.util.*;

class OccurrenceOfCharInString {

	// Driver Code
	public static void main(String[] args) {
		String str = "Ajiti";

		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>();

		char[] strArray = str.toCharArray();

		for (char c : strArray) {
			if (charCountMap.containsKey(c)) {
				charCountMap.put(c, charCountMap.get(c) + 1);
			} else {
				charCountMap.put(c, 1);
			}
		}

		for (Map.Entry entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + "= " + entry.getValue());
		}

	}
}
