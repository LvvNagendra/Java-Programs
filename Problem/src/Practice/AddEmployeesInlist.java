package Practice;

import java.util.ArrayList;
import java.util.List;


public  class AddEmployeesInlist {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
	    employees.add(new Employee(100, "praveen", 9455104973L));
	    employees.add(new Employee(101, "Saurbh", 7355078643L));
	    employees.add(new Employee(103, "Shivendr", 123456789L));
	    
	    System.out.println("ID\tName\tMobile");
	    
	    for (Employee e: employees)
	        System.out.println(e.toString());

	}

}
class Employee {
private int id;
private String name;
private long phoneNumber;


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public long getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(long phoneNumber) {
	this.phoneNumber = phoneNumber;
}

public Employee(int id, String name, long phoneNumber) {
	super();
	this.id = id;
	this.name = name;
	this.phoneNumber = phoneNumber;
}





@Override
public String toString() {
    return id + "\t" + name + "\t" + phoneNumber + "\n";
}
}