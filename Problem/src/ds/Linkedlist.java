package ds;

import java.util.LinkedList;
import java.util.Queue;

public class Linkedlist {
	
	
	    public static void main(String[] args)
	    {
	        //Implementing queue
	        Queue<String> queue = new LinkedList<String>();
	        // Adding Elements in queue 
	        queue.add("Orange");     
	        queue.add("Banana");     
	        queue.add("Mango");     
	        queue.add("Pineapple");     
	 
	        // Prints the front of the queue 
	        System.out.println(queue.peek());
	        // removing elements from queue
	        queue.remove();      
	        queue.remove();     
	 
	        // Prints the front of the queue 
	        System.out.println(queue.peek());
	 
	        // Returns the total number of elements present in the queue
	        System.out.println(queue.size());
	 
	        // check if the queue is empty
	        if (queue.isEmpty()) {
	            System.out.println("The queue is empty");
	        }
	        else {
	            System.out.println("The queue is not empty");
	        }
	    }
	}
	


