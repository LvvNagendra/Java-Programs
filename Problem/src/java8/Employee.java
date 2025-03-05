package java8;

import java.util.Arrays;
import java.util.List;

public class Employee {
    public static void main(String[] args) {
        // Creating a list of EmployeeDetails objects
        List<EmployeeDetails> emp1 = Arrays.asList(
            new EmployeeDetails(1, "Nagendra"),
            new EmployeeDetails(2, "Gopi"),
            new EmployeeDetails(3, "Binnu")
        );

        // Using Stream API to print employee details
        emp1.stream().forEach(System.out::println);
    }

	@Override
	public String toString() {
		return "Employee [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
}

class EmployeeDetails {

    private int id;
    private String name;

    // Constructor
    public EmployeeDetails(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters and Setters
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

    // Overriding toString method to display employee details
    @Override
    public String toString() {
        return "EmployeeDetails [id=" + id + ", name=" + name + "]";
    }
}
