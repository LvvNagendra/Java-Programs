package beaut;
interface A{
	void display();
	void show();
	
}
interface B{
	void display();
	void show();
	
}
abstract class AB implements A,B{
	
		 public void A display() {
			 System.out.println("A display");
			 
			 
		 }
			 public void  showA() {
				 System.out.println("A SHOW ");
				
			}
			 public   void displayB() {
				 System.out.println(" B display");
				 
			 
		
	}
			 public void  showB() {
				 System.out.println(" B show");
	
}
public class Interface {

	public void main(String[] args) {
		//Interface obj= new Interface();
		B obj1=new B();
		obj1.displayA();
		obj1. showA();
		obj1.displayB();
		obj1. showB();
		
		
		
	}

	private void displayB() {
		// TODO Auto-generated method stub
		
	}

	private void showB() {
		// TODO Auto-generated method stub
		
	}

	private void displayA() {
		// TODO Auto-generated method stub
		
	}

	private void showA() {
		// TODO Auto-generated method stub
		
	}

	

	
		
	}
		
	}


