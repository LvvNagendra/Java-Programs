package mostaskingquestions;

import java.security.Identity;
import java.util.Collections;

// Ensure this matches your folder structure

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyString {
	public static void main(String[] args) {
		String str = "nagendraa";
		Map<Character, Integer> charCountMap = new HashMap<>();

		for (int i = 0; i < str.length(); i++) {
			char lowercaseC = str.charAt(i);
			charCountMap.put(lowercaseC, charCountMap.getOrDefault(lowercaseC, 0) + 1);
		}

		// Printing the frequency of characters in the string
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.println(entry.getKey() + ":" + entry.getValue() + " ");
		}

		// java8

		Map<Character, Long> java8 = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("java8" + java8);
	}
}
