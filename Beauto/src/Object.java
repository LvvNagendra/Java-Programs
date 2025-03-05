
public class Object {
	int i=20;
	static int j=30;

	public static void main(String[] args) {
		Object o=new Object();
		System.out.println(o.i);
		System.out.println(o.j);
		Object o1=new Object();
		o1.i=200;
		o1.j=300;
		System.out.println(o.i);
		System.out.println(o.j);
		System.out.println(o1.i);
		System.out.println(o1.j);
	}

}
