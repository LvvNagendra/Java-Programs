package ehandle;

public class Test {

	public static void main(String[] args) {
		try {

			try {
				int a = 100 / 0;
			} catch (ArithmeticException e) {
				System.out.println("ArithmeticException");
			}

		try {

			int a[] = new int[5];

			System.out.println(a[5]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException");
		}

		System.out.println("Null Pointer example");
		String str = null;

		System.out.println(str.length());

	} catch (Exception e) {
		System.out.println("Parent Exception");
	}
	System.out.println("flow continue");

}

	}

