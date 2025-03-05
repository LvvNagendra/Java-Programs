package collections;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class ArrayStack {

	public static void main(String[] args) {
		Stack<Integer> as= new Stack<Integer>();
		as.push(9);
		as.push(8);
		as.push(7);
		System.out.println(as);
		 boolean bs= as.empty();
		 System.out.println(bs);
		 PriorityQueue<String> q = new PriorityQueue<String>();
		 q.add("nani");
		 q.add("lilly");
		 q.add("sai");
		 q.add("sai");
		 System.out.println(q);
		 
		 System.out.println(q.element());
		 System.out.println(q.peek());
		
		System.out.println(q.remove());
		System.out.println(q);
		 System.out.println(q.poll());
		
	}

	
		
	}


