package string;

import java.util.HashMap;
import java.util.Map;

public class AllString {

	public static void main(String[] args) {
		String str = "Lankalapalli Veera Venkata Nagendra";

		AllString all = new AllString();

		all.getWordVowelCount(str);
		all.frequenceCharacter(str);

	}

	private void getWordVowelCount(String str) {
		int wordCount = 1;
		int vowelCount = 0;
		int upperCaseCount = 0;
		int lowerCaseCount = 0;
		
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			switch (c) {
			case ' ':
			case '.':
				wordCount++;

			}
			switch (c) {
			case 'A':
			case 'E':
			case 'I':
			case 'O':
			case 'U':
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':

				vowelCount++;
			}

			if (c >= 65 && c <= 95) {
				upperCaseCount++;
			} else {
				lowerCaseCount++;
			}
		}
		System.out.println("word count=" + wordCount);
		System.out.println("vowels=" + vowelCount);
		System.out.println("uppercase count=" + upperCaseCount);
		System.out.println("lowercase count=" + lowerCaseCount);

	}
	
	
	

	private void frequenceCharacter(String str) {
		int freq[] = new int[str.length()];
		int i, j;

		// Converts given string into character array
		char string[] = str.toCharArray();

		for (i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < str.length(); j++) {
				if (string[i] == string[j]) {
					freq[i]++;

					// Set string[j] to 0 to avoid printing visited character
					string[j] = '0';
				}
			}
		}

		// Displays the each character and their corresponding frequency
		System.out.println("Characters and their corresponding frequencies");
		for (i = 0; i < freq.length; i++) {
			if (string[i] != ' ' && string[i] != '0')
				System.out.println(string[i] + "-" + freq[i]);
		}

	}

}
