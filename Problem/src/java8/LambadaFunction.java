package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LambadaFunction {

	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alice", "cBob", "bCharlie");
		Collections.sort(names, (a, b) -> a.compareTo(b));
		System.out.println(names);

	}

}
