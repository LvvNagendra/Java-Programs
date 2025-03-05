package ehandle;

public class ThrowsExceptiom2 {
	static  void display()throws ArithmeticException{
		int a=3/0;
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			display();
			
		}catch(ArithmeticException e) {
			e.printStackTrace();
		}
		System.out.println("the program is excuted");

	}

}
