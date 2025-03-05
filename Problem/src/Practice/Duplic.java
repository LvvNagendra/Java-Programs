package Practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import javax.print.attribute.IntegerSyntax;

public class Duplic {

	public static void main(String[] args) {
		int a[]= {1,1,2,2,3,4,};
		//remove duplicate using set
		Set<Integer> set=new HashSet<Integer>();
		for(int set1:a) {
			set.add(set1);
		}
		System.out.println("renmove Duplicate" +set);
		
		for(int i = 0;i<a.length;i++) {
			for(int j=i+1; j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println( "duplicatea="+ a[i]+ " ");
				}}}
//remove duplicate using Stream Api
		List<Integer> list = Arrays.asList(1,2,3,4,1,3);

		// Get list without duplicates
		List<Integer> distinctItems = list.stream()
		                                    .distinct()
		                                    .collect(Collectors.toList());
		

		// Let's verify distinct elements
		System.out.println("remve duplicate"+distinctItems);
		
		
		
	}

}
