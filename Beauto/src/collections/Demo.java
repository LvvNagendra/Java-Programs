package collections;

import java.util.Stack;
import java.util.Vector;

public class Demo {

	public static void main(String[] args) {
		Vector vl= new Vector();
		vl.add("nagendra");
		vl.add("vikash");
		vl.add("prasanth");
		vl.add("bhanu");
		vl.add("nagendra");
		System.out.println(vl);
		System.out.println(vl.clone());
		Stack s= new Stack();
		s.add("nagendra");
		s.add("vikash");
		s.add("prasanth");
		s.add("bhanu");
		s.add("nagendra");
		System.out.println(s);

	}

}
