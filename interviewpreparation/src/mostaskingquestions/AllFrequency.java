package mostaskingquestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AllFrequency {

	public static void main(String[] args) {
		String str = "nagendra is good bineeth is good";
		int a[] = { 2, 3, 4, 2, 4, 5, 6, 8, 9, 8 };
		List<String> wordss=Arrays.asList("nagendra and lilly friends","lilly and nagendra lovers");
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

		Map<String, Long> word = Arrays.stream(str.split(" "))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(word);
		
		Map<Integer, Long> number=Arrays.stream(a).boxed().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(number);
		Map<String,Long>words=wordss.stream().flatMap(m->Arrays.stream(m.split(" "))).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(words);

	}

}
