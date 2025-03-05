package java8;

import java.text.Collator;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Practice {

	public static void main(String[] args) {
		String str="nagendra Naidu Naidu";
		List<String> list=Arrays.asList(str.split(" "));
		Map<String,Long> map=list.stream()
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		
		Map<Character,Long> maps=str.replace(" ", "").chars()
				.mapToObj(c->(char) c)
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(maps);
	}

}
