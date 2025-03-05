package beaut;

public class Overloading {
	void sum(int a, int b) {
		System.out.println(a+ b);
		}
	void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}

	public static void main(String[] args) {
		Overloading s= new Overloading ();
		s.sum(11, 12);
		s.sum(11, 12,13);
		
		
	}

}
