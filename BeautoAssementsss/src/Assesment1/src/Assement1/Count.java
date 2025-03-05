package Assesment1.src.Assement1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Count {

	public static void main(String[] args) {
		Map < String, Integer > map = (Map<String, Integer>) new HashMap ();

		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter a string:");

		String sentence = sc.nextLine();

		String[] tokens = sentence.split(" "); 

		for (String token: tokens) {

		String word = token.toLowerCase();

		if (map.containsKey(word)) {

		int count = map.get(word); 

		map.put(word, count + 1); 

		} else {

		map.put(word, 1); 
		}

		}

		//display the data

		Set < String > keys = map.keySet(); 

		TreeSet < String > sortedKeys = new TreeSet < > (keys); 

		for (String str: sortedKeys) {

		System.out.println("Word =" + str + " and it's count = " + map.get(str));

		}

		
	}

}
