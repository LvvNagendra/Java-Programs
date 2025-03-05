package nagendra;
class nag{
	String name;
	int rollno;
	String department;
	nag(String name,int rollno,String department)
	{
	this.name=name;
	this.rollno=rollno;
	this.department=department;
	}
	void printMessage()
	{
		System.out.println(name+" "+rollno+" "+department+" ");
	}
	
}

public class Nani {

	public static void main(String[] args) {
		nag n=new nag("nani",519,"IT");
		n.printMessage();

	}

}
