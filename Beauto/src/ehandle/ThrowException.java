
package ehandle;


public class ThrowException {
	static void validate(int age) {

	if (age <18) {
		throw new ArithmeticException( " your not eligible for  vote");
		
	}
	else {
		System.out.println("eligible for  vote");
	}
	}
	
	public static void main(String[] args) {
		validate(30);
		System.out.println("program will excuted");
		
		
		
	}

}
