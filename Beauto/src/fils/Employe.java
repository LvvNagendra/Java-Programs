package fils;

import java.util.Scanner;

public class Employe  implements Cloneable{
	int id;
	String name;
	int age;
	Employe (int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
	public void view() {
		System.out.println(" id:"+id);
		System.out.println("name:"+name);
		System.out.println("age:"+age);
	}


	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a employee id:");
		
		int id=s.nextInt();
		System.out.println("enter a employee name:");
		String name=s.next();
		System.out.println("enter a employee age:");
		int age=s.nextInt();
		Employe e=new Employe(age, name, age);
		Employe e1=(Employe)e.clone();
		e.view();
		e1.view();
		
		
		

	}

}
