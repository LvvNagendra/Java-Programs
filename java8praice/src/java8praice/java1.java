package java8praice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class java1 {

	public static void main(String[] args) {
		 List<Employee> emps = new ArrayList<>();

	        Employee e1 = new Employee();
	        e1.setId(1);
	        e1.setName("nagendra");
	        e1.setSalary(2000);
	        emps.add(e1);

	        Employee e2 = new Employee();
	        e2.setId(2);
	        e2.setName("nagendra2");
	        e2.setSalary(3000);
	        emps.add(e2);

	        Employee e3 = new Employee();
	        e3.setId(3);
	        e3.setName("nagendra3");
	        e3.setSalary(4000);
	        emps.add(e3);

	        // Finding the employee with the second-highest salary
	        Employee secondHighestSalaryEmployee = emps.stream()
	            .sorted(Comparator.comparingDouble(Employee::getSalary).reversed())
	            .skip(1) // Skip the first (highest salary)
	            .findFirst() // Get the second one
	            .orElse(null); // Handle case where there are fewer than 2 employees

	        if (secondHighestSalaryEmployee != null) {
	            System.out.println("Employee with the second-highest salary: " + secondHighestSalaryEmployee);
	        } else {
	            System.out.println("There are not enough employees to determine the second-highest salary.");
	        }
	    }
	}

	class Employee {
	    private int id;
	    private String name;
	    private double salary;

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

	    public double getSalary() {
	        return salary;
	    }

	    public void setSalary(double salary) {
	        this.salary = salary;
	    }

	    @Override
	    public String toString() {
	        return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	    }
	}