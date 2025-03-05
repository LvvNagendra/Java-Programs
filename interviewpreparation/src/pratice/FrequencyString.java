package pratice;

import java.util.HashMap;
import java.util.Map;

public class FrequencyString {

	public static void main(String[] args) {
		String str="nagendra";
		char a[]=str.toCharArray();
		Map <Character,Integer> map=new HashMap<>();
		for(char b:a) {
			
			map.put(b, map.getOrDefault(b, 0)+1);
				
			}
		for(Map.Entry<Character,Integer> set:map.entrySet()) {
			System.out.println(set.getKey()+":"+set.getValue());
			
		}

	}

}
