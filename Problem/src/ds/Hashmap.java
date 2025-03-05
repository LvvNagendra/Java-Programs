package ds;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
	
	    public static void main(String[] args)
	    {
	 
	        // Creating HashMap
	        Map<String, Integer> map = new HashMap<>();
	 
	        // Inserting entries in the Map
	        map.put("Mango", 10);
	        map.put("Apple", 20);
	        map.put("Banana", 30);
	 
	        // Iterating over Map
	        for (Map.Entry<String, Integer> e : map.entrySet())
	 
	            // Printing key-value pairs
	            System.out.println(e.getKey() + " "
	                               + e.getValue());
	    }
	}

