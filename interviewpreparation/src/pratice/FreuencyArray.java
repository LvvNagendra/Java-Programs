package pratice;

import java.util.HashMap;
import java.util.Map;

public class FreuencyArray {

	public static void main(String[] args) {
		int a[]= {3,5,6,8,9,2,3,5};
		Map<Integer,Integer> map= new HashMap<>();
		for(int i : a) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for(Map.Entry<Integer, Integer> set:map.entrySet()){
			System.out.println(set.getKey()+":"+ set.getValue());
		}

	}

}
