class father{
	public void print() {
		System.out.println("father method");
	}
}
class child extends father{
	public void print() {
		System.out.println("son method");
	}
	
	
}
public class OVERRIDING {

	public static void main(String[] args) {
		 child obj =new child(); 
		 obj.print();
		 father obj2 =new father();
		 obj2.print();

	}

}
