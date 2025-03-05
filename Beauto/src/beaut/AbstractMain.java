package beaut;
  abstract class A
{
	void display() {
		System.out.println("abstract method B");
		
	}
	
}
  class B extends A{
	  void display() {
		  System.out.println("abstaract method in A");
	  }
  }
 class C extends A{
	 
	  void display() {
		  System.out.println(" abstract method in c");
	  }
	 
  }

public class AbstractMain {

	public static void main(String[] args) {
		 B obj= new B();
	 C obj1=new C();
		//A obj2=new A();
		 obj1.display();
		 
	}

}
