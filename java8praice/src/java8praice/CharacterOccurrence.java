package java8praice;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrence {
	 public static void main(String[] args) {
	        String str = "nagendra nagendra";

	        // Using chars() to get character occurrences
	       Map<Character,Long> occ=str.chars()
	       .mapToObj(c ->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	       System.out.println(occ);
	       Map<String, Long> wordOccurrences = Arrays.stream(str.split(" "))
	               .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	           System.out.println(wordOccurrences);
	       
	    }

}
