package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.*;

public class Hashset1 {

	public static void main(String[] args) {
		HashSet as=new HashSet();
		as.add("nagendra");
		as.add("vikash");
		as.add("prasanth");
		as.add("bhanu");
		as.add("nagendra");
		System.out.println(as);
		LinkedHashSet lh=new LinkedHashSet();
		lh.add("nagendra");
		lh.add("vikash");
		lh.add("prasanth");
		lh.add("bhanu");
		lh.add("nagendra");
		System.out.println(lh);
		TreeSet ts =new TreeSet();
		ts.add("nagendra");
		ts.add("vikash");
		ts.add("prasanth");
		ts.add("bhanu");
		ts.add("nagendra");
		System.out.println(ts);
		
	}

}
