package beaut;
public class Varible {
	int id=20;//instance variable
	 static int salary =2250; //static variable

	public static void main(String[] args) {
		Varible v=new Varible();
		System.out.println(v.id);
		System.out.println(v.salary);
		Varible v1=new Varible();
		 v1.id=25;//local methods
		 v1.salary=5000;
		 System.out.println(v.id);
			System.out.println(v.salary);
			System.out.println(v1.id);
			System.out.println(v1.salary);
		}}
