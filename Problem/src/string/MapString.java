package string;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MapString {

	public static void main(String[] args) {
		String str = "nagendraa";
//		Map<Integer, Long> occu=str.chars().mapToObj(ch->ch).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
//		                       
//	        System.out.println( "java8"+occu);
		Map<Character, Integer> charCountMap = new HashMap<>();
		for (int i = 0; i < str.length(); i++) {
			char lowercaseC = str.charAt(i);
			charCountMap.put(lowercaseC, charCountMap.getOrDefault(lowercaseC, 0) + 1);
		}
		for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
			System.out.print(entry.getKey() + ":" + entry.getValue());
		}

	}

}
