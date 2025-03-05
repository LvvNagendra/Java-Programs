package collections;

import java.util.LinkedList;

public class linked2 {

	public static void main(String[] args) {
		LinkedList ll= new LinkedList();
		ll.add("nagendra");
		ll.add("vikash");
		ll.add("prasanth");
		ll.add("bhanu");
		System.out.println(ll);
		System.out.println(ll.addAll(0, ll));
		System.out.println(ll);
		System.out.println(ll.get(0));
		System.out.println(ll.remove(3));
		System.out.println(ll);
		System.out.println(ll.removeAll(ll));
		System.out.println(ll);
	}

}
