package pratice;

public class objc {
	int a;
	int b;
	//void method() {
		//System.out.println("method");
	//}
	int add(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
		objc a= new objc();
		System.out.println( a.add(5,10));

	}

}
