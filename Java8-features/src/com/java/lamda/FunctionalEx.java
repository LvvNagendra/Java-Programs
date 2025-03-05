package com.java.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/*class FunctionalDemo implements Function<String, Integer>

{

	@Override
	public Integer apply(String t) {
		// TODO Auto-generated method stub
		return t.length();
	}
	
}*/
public class FunctionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Function <String , Integer> function = (s) -> s.length();
		System.out.println(function.apply("Pratik Bhoir"));
		
		List<String> s=Arrays.asList("qqm","mma","bbc","ccd","ppq");
   		s.stream().sorted().findFirst().ifPresent(System.out::println);//forEach(System.out::println);
   		
   		List<String> s1=Arrays.asList("qqm","mma","bbc","ccd","ppq");
   		
   		
   		s1.stream().sorted().forEach(System.out::println);//forEach(System.out::println);
		
	}

}
