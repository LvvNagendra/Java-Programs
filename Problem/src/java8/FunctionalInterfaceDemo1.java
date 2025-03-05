package java8;

public class FunctionalInterfaceDemo1 {
	@FunctionalInterface
	interface MyFunction {
	    int apply(int x, int y);
	}

	public static void main(String[] args) {
		
		// Using a functional interface with a lambda expression
		MyFunction add = (x, y) -> x + y;
		System.out.println(add.apply(2, 3));

	}

}
