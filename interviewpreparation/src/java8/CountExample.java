package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountExample {
public static void main(String[] args) {
	List<String> words=Arrays.asList("na","nani","li","lilly");
	long count=words.stream().filter(word ->word.length()>3).count();
	List<String> three=words.stream().filter(word ->word.length()>3).collect(Collectors.toList());
	System.out.println(three);
	System.out.println(count);
}
}
