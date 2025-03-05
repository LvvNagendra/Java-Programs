package Practice;
class Nani{
	static void test() {
		
		System.out.println(" static nagendra");
		Method m= new Method();
		m.testA();
	}
}


public class Method {
	public  void testA() {
		System.out.println("non static");
		
	}
	public static void main(String[] args) {
		Nani a=new Nani();
		a.test();
		
	}

	

}
