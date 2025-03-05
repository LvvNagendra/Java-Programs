package com.java.lamda.practice;

	import java.util.ArrayList;
	import java.util.Comparator;
	import java.util.List;
	import java.util.Map;
	import java.util.Optional;
	import java.util.stream.Collectors;

	class EmployeeData2
	{
	    int id;
	     
	    String name;
	     
	    int age;
	     
	    String gender;
	     
	    String department;
	     
	    int yearOfJoining;
	     
	    double salary;
	     
	    public EmployeeData2(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
	    {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.gender = gender;
	        this.department = department;
	        this.yearOfJoining = yearOfJoining;
	        this.salary = salary;
	    }
	     
	    public int getId() 
	    {
	        return id;
	    }
	     
	    public String getName() 
	    {
	        return name;
	    }
	     
	    public int getAge() 
	    {
	        return age;
	    }
	     
	    public String getGender() 
	    {
	        return gender;
	    }
	     
	    public String getDepartment() 
	    {
	        return department;
	    }
	     
	    public int getYearOfJoining() 
	    {
	        return yearOfJoining;
	    }
	     
	    public double getSalary() 
	    {
	        return salary;
	    }
	     
	    @Override
	    public String toString() 
	    {
	        return "Id : "+id
	                +", Name : "+name
	                +", age : "+age
	                +", Gender : "+gender
	                +", Department : "+department
	                +", Year Of Joining : "+yearOfJoining
	                +", Salary : "+salary;
	    }
	    
	    public static void main(String[] args) {
			
		
	    
	    List<EmployeeData2> employeeList = new ArrayList<EmployeeData2>();
	    
	    employeeList.add(new EmployeeData2(111, "Jiya Brein", 32, "Female", "HR", 2011, 125000.0));
	    employeeList.add(new EmployeeData2(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 113500.0));
	    employeeList.add(new EmployeeData2(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 189000.0));
	    employeeList.add(new EmployeeData2(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 302500.0));
	    employeeList.add(new EmployeeData2(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
	    employeeList.add(new EmployeeData2(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
	    employeeList.add(new EmployeeData2(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
	    
	    
	    System.out.println("Sorting with Name");
	    employeeList.stream().map(n->n.getSalary()).filter(n->n>20000).sorted().forEach(System.out::println);
	    
	    Map<String, Double> Namesort = employeeList.stream().collect(Collectors.groupingBy(EmployeeData2::getName,
	    		Collectors.summingDouble(EmployeeData2::getSalary)));
	    		
	    		System.out.println(Namesort);
	    		
	    		employeeList.stream().map(n->n.getAge()).filter(n->n>20).forEach(System.out::println);
	    		
	    		
	    		Map<String, Long> list2= employeeList.stream().collect(Collectors.groupingBy(EmployeeData2::getDepartment,Collectors.counting()));
	    		
	    		System.out.println(list2);
	    		
	    		Optional<EmployeeData2> highestPaid=
	    				  employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(EmployeeData2::getSalary)));
	    		
	    		EmployeeData2 hightestsal = highestPaid.get();
	    		
	    		System.out.println("Name: " +hightestsal.name + " Salary:- "+ hightestsal.getSalary());
	    		
	    		
	    		
	    }
	}