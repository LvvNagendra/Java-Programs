package beaut;
class student{
int id;
String name;
String city;
public student() {
	System.out.println("student details");
}
public String toString() {
	return "id="+id+ "name=" +name+"city="+city;
}
student(int id,String name,String city){
	System.out.println("3 peramaters");
	this.id=id;
	this.name=name;
	this.city=city;
}
}
public class Obj {
	public static void main(String[] args) {
		student s1=new student(11,"nani","yanam");
		student s2=new student(12,"vikas","kkd");
		student s3=new student(13,"bhanu","kkd");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s1.toString());
		System.out.println(s1.getClass());
		System.out.println(s1.hashCode());
		System.out.println(s1.equals(s2));

	}

}
 