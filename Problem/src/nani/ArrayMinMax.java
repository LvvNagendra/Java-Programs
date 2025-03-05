package nani;

import java.util.Arrays;
import java.util.OptionalInt;

public class ArrayMinMax {

	public static void main(String[] args) {
		int []arr= {4,3,5,1,2};
		int min=arr[0];
		int max =arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(min +" nani " +max);
	
//		OptionalInt mins = Arrays.stream(arr).min();
//
//	      // Finding Max using Stream
//	      OptionalInt maxs = Arrays.stream(arr).max();
//
//	      // Printing Min and Max
//	      System.out.println(mins.orElseThrow() + " nani " + maxs.orElseThrow());
	}
	  
}
