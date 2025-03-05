package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lamada {
	public static void main(String args[]) {
		List<String> shoppingList = new ArrayList<String>();
		shoppingList.add("Onions");
		shoppingList.add("Bread");
		shoppingList.add("Flour");
		shoppingList.add("Sugar");
		shoppingList.add("Chicken");
		// Print out each item in the shopping list usig Java 8's
		// forEach
		shoppingList.forEach(item -> System.out.println(item));
		//method reference
		System.out.println("method reference:===");
		shoppingList.forEach(System.out::println);
		
		
		
		}

}





