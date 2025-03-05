package beaut;
 interface Nani
 {
	 void Adisplay();
	 void Ashow();
	
}
interface Sai
{
	void Bdisplay();
	void Bshow();
}
  class AB2 implements Nani,Sai{
	 public void A1display() {
		System.out.println("A DISPLAY");
		
	}
	 public void Ashow() {
		System.out.println("A SHOW");
	}
	 public void Bdisplay() {
		System.out.println("B DISPLAY");
		
	}
	public void Bshow() {
		System.out.println("B SHOW");
	}
	
	public void Adisplay() {
		// TODO Auto-generated method stub
		
	}
	
	
}

 public class  AB1 {
	
	

	public static void main(String[] args) {
		AB2 obj=new AB2();
		obj.Adisplay();
		obj.Bdisplay();
		obj.Ashow();
		obj.Bshow();
		
		
		
	}

}