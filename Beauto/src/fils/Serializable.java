package fils;

import java.*;
import java.io.FileOutputStream;

import java.io.ObjectOutputStream;
import java.io.Serializable;
class Student implements Serializable  {
	int id;
	String name;
	int age;
	Student(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
		 class Serializable{
		public void main(String[] args) {
		Student s1= new Student(1,"nani",23);
		Student s2= new Student(2,"nagendra",22);
	try {
	FileOutputStream fo=new FileOutputStream("D:\\nani");
	ObjectOutputStream ob= new ObjectOutputStream(fo);
	ob.writeObject(s1);
	ob.writeObject(s2);
	fo.close();
	
			
		}
	catch(Exception e) {
		e.printStackTrace();
		
	}

	}

}}}