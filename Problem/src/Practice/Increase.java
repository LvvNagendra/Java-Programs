package Practice;

import java.util.HashMap;
import java.util.Map;

public class Increase {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>(20, 0.75f);

		// Add some entries to the map
		map.put("apple", 1);
		map.put("banana", 2);
		map.put("orange", 3);

		// Increase the capacity to 50
		Map<String, Integer> newMap = new HashMap<>(50, 0.75f);
		newMap.putAll(map);

		// Use the new map with increased bucket size
		map = newMap;
		System.out.println(newMap);
	}

}
