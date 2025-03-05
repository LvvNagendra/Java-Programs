package Assement1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
	String str = "Abc bcd  Abc ABC pqr XYZ pqr mnq ABC xyz XYZ pqr";
	 String arr[]=str.split(" ");
	  Set<String>s=new LinkedHashSet<String>();
	  for(int i=0;i<arr.length;i++) {
		  s.add(arr[i]);
	  }
	  for(String ss:s) {
		  System.out.print(ss+" ");
	  }
	  System.out.println();

	 
	}
}
			     
			        
			      
		
		
