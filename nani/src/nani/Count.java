package nani;

import java.util.HashMap;
import java.util.Map;

public class Count {
	public static void main(String[] args) {
		String str="nagendra";
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			char r=str.charAt(i);
			map.put(r, map.getOrDefault(r, 0)+1);
		}
		
	for(Map.Entry<Character,Integer> map1:map.entrySet()){
		System.out.println(map1.getKey()+" = "+map1.getValue());
		
	}
		
	}

}
