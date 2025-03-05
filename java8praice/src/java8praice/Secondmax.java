package java8praice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalInt;
import java.util.stream.Collectors;

public class Secondmax {
	public static void main(String[] args) {
		
	
	int[] numbers = {3, 5, 7, 9, 2, 8};
	OptionalInt max =Arrays.stream(numbers).max();
	System.out.println(max.getAsInt());
	
	OptionalInt secondmax=Arrays.stream(numbers).filter(e->e < max.getAsInt()).max();
	 System.out.println(secondmax);

}}
