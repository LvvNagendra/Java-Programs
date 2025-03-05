package com.java.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/*
 * public class PredicateEx implements Predicate<Integer>{
 * 
 * @Override public boolean test(Integer t) { if(t%2==0) { return true; }
 * 
 * else { return false; } }
 * 
 * public static void main(String[] args) {
 * 
 * Predicate<Integer> predic= new PredicateEx();
 * System.out.println(predic.test(8));
 * 
 * }
 * 
 * }
 */

class PredicateEx
{
	public static void main(String[] args) {
		Predicate<Integer> predicate =  t-> { 
			if(t%2==0) 
			{
				return true; 
				}
		 else
		 { 
			 return false;
			 }
			};
		 System.out.println(predicate.test(8));
		 
		 
		 System.out.println("Optimising the code");
		 
		 Predicate<Integer> predicate2 =  t-> t%2==0;
		 System.out.println(predicate2.test(8));
		 
		 System.out.println(predicate2.test(11));
		 
		 List <Integer> mylist = Arrays.asList(2,3,5,4,89,12,45,76);
		 
		 System.out.println("Applying filter condition which internally uses predicate");
		 
		 mylist.stream().filter(p->p%2==0).forEach(p->System.out.println("Print "+p));
		 
		 // print names startingf with A
		 
		 // taking string array
		 
		 String[] names= {"Anuska","Deepika","Ashwarya","Sonam","Anupama"};
		 
		 Predicate<String> p= name->name.charAt(0)=='A';
		 
		 for(String name:names)
		 {
			 if(p.test(name))
					 {
				 
				 System.out.println(name);
			 }
		 }
		 int arr[]= {};
		
		 
		 System.out.println(arr.length);
		 
		 
		
	}
}
