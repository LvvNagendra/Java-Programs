package beaut;

interface Employee
{
	
default void emp()
{
System.out.println("Employee1");
}
}
interface Employee2
{
default void Info()
{
System.out.println("Employee2");
}
}

public class Company1 implements Employee,Employee2{
	

public static void main(String args[])
{
Company1 c = new Company1();
c.Info();
}

	}


