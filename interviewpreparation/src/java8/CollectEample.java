package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CollectEample {
	public static void main(String[] args) {
		List<Integer> numbers=Arrays.asList(12,48,8,59,3,4);
		List<Integer> gaterThen10=numbers.stream()
		.filter(n ->n>10).collect(Collectors.toList());
		System.out.println(gaterThen10);
	}

}
