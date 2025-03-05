package strings;
class Person
{
  String name;
 }
 class Emp extends Person
 {
   int  year;
   double sal;
   String num;
 }
 


public class inhertanceemploy {

	public static void main(String[] args) {
		 Emp e=new Emp();
	     e.name="nani";
	     
	     e.year=2022;
	     e.sal=25.000;
	     e.num="186Q1A0519";
	     System.out.println("ename: "+e.name+" "+"year: "+e.year+" "+"sal:"+e.sal+" "+"num:"+e.num);
	}

}
