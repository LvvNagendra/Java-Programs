package fils;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	int id;
	String name;
	int age;
	Student(int id,String name,int age){
		this.id=id;
		this.name=name;
		this.age=age;
	}
}

public class Serializable2 {

	public static void main(String[] args) throws IOException {
		Student s1= new Student(1,"nani",23);
		try {
		FileOutputStream fo=new FileOutputStream("D:\\lilly.txt");
		ObjectOutputStream ob= new ObjectOutputStream(fo);
		ob.writeObject(s1);
		ob.close();
		System.out.println("success the program");
	}catch(Exception e) {
		e.printStackTrace();
		
	}
		
	}}


