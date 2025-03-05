package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class maps {

	public static void main(String[] args) {
		HashMap hs=new HashMap () ;
		hs.put(1,"vikash");
		hs.put(2,"nagendra");
		hs.put(3,"prasanth");
		hs.put(4, "null");
		System.out.println(hs);
		LinkedHashMap lm=new LinkedHashMap () ;
		lm.put(1,"vikash");
		lm.put(2,"nagendra");
		lm.put(3,"prasanth");
		lm.put(4, "null");
		System.out.println(lm);
		TreeMap tm=new TreeMap();
		tm.put(1,"avikash");
		tm.put(3,"nagendra");
		tm.put(2,"bprasanth");
		tm.put(4, "null");
		System.out.println(tm);

	}

}
