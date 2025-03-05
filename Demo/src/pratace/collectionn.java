package pratace;

import java.util.*;

public class collectionn {

	public static void main(String[] args) {
		ArrayList<String> obj =new ArrayList<String>();
		obj.add("hello");
		obj.add("hi");
		System.out.println(obj);
		ArrayList<String> obj1 =new ArrayList<String>();
		obj1.add("dsfiuhg");
		obj1.add("kauerg");
		obj1.add("hi");
		System.out.println(obj1);
		obj1.retainAll(obj);
		System.out.println(obj1);
}
}
