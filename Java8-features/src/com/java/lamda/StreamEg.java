package com.java.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamEg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String str= "capgemini is great is company";
		
		//List<String> splitting = Arrays.stream(list.sp("\\ ")).
		
		 Map<String, Long> stringcount = Arrays.stream(str.split(" "))
				 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
				 
				 System.out.println(stringcount);
		
	}

}
