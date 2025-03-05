package com.java.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class countStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> fruite = Arrays.asList("babana","apple","apple","kiwi");
		
		Map<String,Long> countfriute =fruite.stream().collect(Collectors.groupingBy(e->e,Collectors.counting()));
		
		System.out.println(countfriute);
		
		Map<Character,Long> countcharacter = fruite.stream() //Stream<String>
		        .flatMap(a -> a.chars().mapToObj(c -> (char) c)) // Stream<Character>
		        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
		System.out.println(countcharacter);
		
		//Map<Character,Long> count2 = fruite.stream() //Stream<String>
		      //  .flatMap(a -> a.chars().mapToObj(c -> (char) c)).filter(c->c.// Stream<Character>
		     //   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
		List <Integer>  List= Arrays.asList(2,3,4,5);
		int even = List.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
		System.out.print(even);
		
		List <Integer>  List1= Arrays.asList(9,8,76,5,4,3,2,3,4,5);
		
		List1.stream().sorted().forEach(n->System.out.println(n));
		
	
	}

}
