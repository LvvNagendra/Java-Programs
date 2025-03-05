package collections;


import java.util.*;
import java.util.Map.Entry;

public class HashEXAMPLE {

	public static void main(String[] args) {
	// TODO Auto-generated method stub
		
		 Hashtable<Integer,String>hm=new Hashtable<Integer,String>();
		  
		  hm.put(100,"Amit");  
		  hm.put(102,"Ravi");  
		  hm.put(101,"Vijay");  
		  hm.put(103,"Rahul");  
		  
		 System.out.println(hm);
		 for(Map.Entry e:hm.entrySet()) {
			 System.out.println(e.getKey()+" "+e.getValue());

}

	 
		
	}}
