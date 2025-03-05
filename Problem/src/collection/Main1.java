package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Map<Integer, String> map = new HashMap<>();
		for (int i = 1; i <= 4; i++) {
			System.out.print("Input " + i + ": ");
			String input = scanner.nextLine();
			map.put(i, input);
		}
		System.out.println("Mappings of HashMap are : " + map);

		int keyToRemove = scanner.nextInt();

		String removedValue = map.remove(keyToRemove);

		System.out.println("Mappings after removal are : " + map);
	}
}
