package Practice;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Employeemax {
    public static void main(String[] args) {
        List<EmployeeDetails> oneList = new ArrayList<>();

        EmployeeDetails emp = new EmployeeDetails();
        emp.setName("John");
        emp.setSalary(50000);
        oneList.add(emp);

        EmployeeDetails emp1 = new EmployeeDetails();
        emp1.setName("Jane");
        emp1.setSalary(60000);
        oneList.add(emp1);

        EmployeeDetails emp2 = new EmployeeDetails();
        emp2.setName("David");
        emp2.setSalary(45000);
        oneList.add(emp2);
        //java8
        Optional<EmployeeDetails> secondheigt=oneList.stream().max(Comparator.comparingDouble(EmployeeDetails ::getSalary));
        System.out.println("binneth----------"+ secondheigt);
        
        
        
        //second hegist
        int maxSalarys = Integer.MIN_VALUE;
        int secondMaxSalary = Integer.MIN_VALUE;
        System.out.println(oneList);
        for (EmployeeDetails emps : oneList) {
        
            int currentSalary = emps.getSalary();
            if (currentSalary > maxSalarys) {
                secondMaxSalary = maxSalarys;
                maxSalarys = currentSalary;
            } else if (currentSalary > secondMaxSalary && currentSalary < maxSalarys) {
                secondMaxSalary = currentSalary;
            }
        }

        if (secondMaxSalary == Integer.MIN_VALUE) {
            System.out.println("No second highest salary found.");
        } else {
            System.out.println("Second highest salary: " + secondMaxSalary);
        }
    
        List<EmployeeDetails> highSalaryEmployees = new ArrayList<>();

        for (EmployeeDetails emps : oneList) {
            if (emps.getSalary() > 49000) {
                highSalaryEmployees.add(emps);
            }
        }

        if (highSalaryEmployees.isEmpty()) {
            System.out.println("No employees with a salary greater than 49,000 found.");
        } else {
            System.out.println("Employees with a salary greater than 49,000:");
            for (EmployeeDetails employee : highSalaryEmployees) {
                System.out.println(employee.getName());
            }
        }
        
        //highest salary employee name
        
        EmployeeDetails maxSalaryEmployee = null;
        int maxSalary = Integer.MIN_VALUE;
        for (EmployeeDetails emps : oneList) {
        	 if (emps.getSalary() > maxSalary) {
        	        maxSalary = emps.getSalary();
        	        maxSalaryEmployee = emps;
        	    }
       
        }
        
        Optional<EmployeeDetails>emp9=oneList.stream().max(Comparator.comparingInt(EmployeeDetails::getSalary));
        System.out.println("java  8"+emp9);
        
        if (maxSalaryEmployee != null) {
            System.out.println("Employee with the maximum salary:");
            System.out.println("Name: " + maxSalaryEmployee.getName());
        } else {
            System.out.println("No employees found in the list.");
       }
    }
   
}

class EmployeeDetails {
    private String name;
    private int salary;

    // Getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

	@Override
	public String toString() {
		return "EmployeeDetails [name=" + name + ", salary=" + salary + "]";
	}
	
	
    
}
