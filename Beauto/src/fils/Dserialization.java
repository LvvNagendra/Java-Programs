package fils;




import java.io.FileInputStream;
import java.io.ObjectInputStream;
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


public class Dserialization {

	public static void main(String[] args) {
		
		try {
			FileInputStream fo=new FileInputStream("D:\\lilly.txt");
		ObjectInputStream ob= new ObjectInputStream(fo);
		Student s1= (Student)ob.readObject();
		ob.close();
		fo.close();
		System.out.println(s1.id+""+s1.name+""+s1.age);
		

	}catch(Exception e) {
		e.printStackTrace();

}}}
