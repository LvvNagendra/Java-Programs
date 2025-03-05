package com.java.lamda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MinMaxvalue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> intlist = Arrays.asList(2,56,45,34,87,9,87,2);
		
		int [] str = {2,56,45,34,87,9,97,2};
		
		int  newlist = Arrays.stream(str).max().orElse(1);

		System.out.println(newlist);
		
		
		Optional<Integer> result = intlist.stream().max(Comparator.comparingInt(e->e));
		
		System.out.println(result);
		
		String str1 = "Pratik";
		
		StringBuilder obj = new StringBuilder();
		
		obj.append(str1);
		
		//System.out.println(obj.reverse());
		
		char [] ch= str1.toCharArray();
		
		for(int i=str1.length()-1;i>=0;i--)
			
		{
			System.out.print(ch[i]);
		}
		

	}

}
