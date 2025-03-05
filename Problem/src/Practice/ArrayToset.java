package Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ArrayToset {

	public static void main(String[] args) {
		int[] arr = { 2, 6, 4 , 2, 3, 3, 1, 7 }; 
		Set<Integer>set =new HashSet<Integer>();
		for(int set1:arr) {
			set.add(set1);
			
		}

		ArrayList<Integer> arrayList = new ArrayList<>();
		for (int value : arr) {
		    arrayList.add(value);
		}
		
		
		
		System.out.println("ArrayList: " + arrayList);
		System.out.println("set" + set );
		
		
	}

}
