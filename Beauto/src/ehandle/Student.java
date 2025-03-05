package ehandle;

public class Student {

	public static void main(String[] args) {
		try {

			
			try {

				int a[] = new int[10];

				System.out.println(a[10]);
				

			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("ArrayIndexOutOfBoundsException");
			}
			try {
				int i= 100/0;
				System.out.println(i);
			}
				
				

			catch(ArithmeticException e) {
				System.out.println("ArthmaticException");
				
			}
				System.out.println("hello");
				
			

			

			System.out.println("Null Pointer example");
			String str = null;

			System.out.println(str.length());

		} catch (Exception e) {
			System.out.println("Parent Exception");
		}
		System.out.println("flow continue");
		

	

}
}