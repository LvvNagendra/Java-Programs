package nani;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		String str="nagendra";
		Map<Character, Long> s=str.chars().mapToObj(c->(char)c).collect
				(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(s);
	
		 int arr[] = {1, 1, 2, 3, 3, 4, 5, 6, 6};
	        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
	        Map<Integer, Long> result = list.stream()
	                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

	        // Print the result
	        System.out.println(result);
	
	}
}
