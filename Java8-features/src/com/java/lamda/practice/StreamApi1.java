package com.java.lamda.practice;

import java.util.Arrays;
import java.util.List;

public class StreamApi1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List <Integer> num = Arrays.asList(9,4,7,4,5,2,1,12,9,3);
		/* num.forEach(n->System.out.println(n*2)); */
		
		num.stream()
		.filter(n->n%2==0).sorted()
		.map(n->n*2)
		.forEach(n->System.out.println(n));
		
		
		
		
		
	}

}
