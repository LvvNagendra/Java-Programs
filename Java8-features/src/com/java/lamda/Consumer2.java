package com.java.lamda;

import java.util.function.Consumer;
import java.util.Arrays;
import java.util.List;
public class Consumer2 {

	public static void main(String[] args) {
		
		Consumer<Integer> consum = n->System.out.println("The number is "+n);
		consum.accept(10);
			 
		System.out.println("=================");
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8);
	
		list.stream().forEach(consum);
		
		System.out.println("=================");
		
		List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		list2.stream().forEach(t->System.out.println("print "+t));
		
		
	}
	
}
