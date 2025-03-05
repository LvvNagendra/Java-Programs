package com.java.lamda.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TooManyListenersException;
import java.util.TreeMap;
import java.util.stream.Collectors;

class EmployeeData
{
    int id;
     
    String name;
     
    int age;
     
    String gender;
     
    String department;
     
    int yearOfJoining;
     
    double salary;
     
    public EmployeeData(int id, String name, int age, String gender, String department, int yearOfJoining, double salary) 
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
		
	
    
    List<EmployeeData> employeeList = new ArrayList<EmployeeData>();
    
    employeeList.add(new EmployeeData(111, "Jiya Brein", 32, "Female", "HR", 2011, 125000.0));
    employeeList.add(new EmployeeData(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 113500.0));
    employeeList.add(new EmployeeData(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 189000.0));
    employeeList.add(new EmployeeData(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 302500.0));
    employeeList.add(new EmployeeData(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
    employeeList.add(new EmployeeData(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
    employeeList.add(new EmployeeData(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
    
    System.out.println("####print the get to the slaray and age ,department ....etc ###");
    employeeList.stream().map(x->x.getSalary()).filter(x->x>30000).forEach(System.out::println);
    employeeList.stream().map(x->x.getAge()).filter(x->x>30).forEach(System.out::println);
    employeeList.stream().map(x->x.getDepartment()).distinct().forEach(System.out::println);
    employeeList.stream().map(x->x.getGender()).distinct().forEach(System.out::println);
    System.out.println("==============");
    employeeList.stream().map(x->x.getYearOfJoining()).filter(x->x>=2015).forEach(System.out::println);
    System.out.println("***********************************");
    
    
    
    
    Map<String, Long> employeeCountByDepartment=
    employeeList.stream().collect(Collectors.groupingBy(EmployeeData::getDepartment, Collectors.counting()));
	System.out.println(employeeCountByDepartment);
	
    System.out.println("====================print the male and female over all===========");
    Map<String, Long> noOfMaleAndFemaleEmployees=
 employeeList.stream().collect(Collectors.groupingBy(EmployeeData::getGender,TreeMap::new, Collectors.counting()));
 		System.out.println(noOfMaleAndFemaleEmployees);
    
    		
     System.out.println("=====***********=====print Department====**********=======");
	
     employeeList.stream().map(EmployeeData::getDepartment).distinct().forEach(System.out::println);
     
     
     System.out.println("=====***********=====print Details  Employee oldestEmployeeWrapper====**********=======");
 
     
     Optional<EmployeeData> oldestEmployeeWrapper = employeeList.
    		 stream().max(Comparator.comparingInt(EmployeeData::getAge));
     
     EmployeeData oldestEmployee = oldestEmployeeWrapper.get();
              
     System.out.println("Name : "+oldestEmployee.getName());
              
     System.out.println("Age : "+oldestEmployee.getAge());
              
     System.out.println("Department : "+oldestEmployee.getDepartment());
     
     System.out.println("=====***********=====print Details Of Highest Paid Employee====**********=======");
 
     
  Optional<EmployeeData> highestPaid=
		  employeeList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(EmployeeData::getSalary)));
    		 EmployeeData highestPaidEmployee = highestPaid.get();
    		 System.out.println("Salary : "+highestPaidEmployee.getSalary());
  System.out.println("=====***********=====print Details Of Highest Age Employee====**********=======");

  
    Optional<EmployeeData> highestAgest=
    		employeeList.stream().collect(Collectors.maxBy(Comparator.comparingInt(EmployeeData::getAge)));
	 EmployeeData highestAge = highestAgest.get();
			  System.out.println("Age : "+highestAge.getAge());

  System.out.println("========getYearOfJoining ==========================");

    		 employeeList.stream()
             .filter(e -> e.getYearOfJoining() > 2015)
             .map(EmployeeData::getName)
             .forEach(System.out::println);
     
   System.out.println("=====***********=====print Employee vise  get total  salary Employees====**********=======");
		  
		  Map<String, Double> salaryEmployees=
		  employeeList.stream().collect(Collectors.groupingBy(EmployeeData::getName,
		  Collectors.summingDouble(EmployeeData::getSalary)));
		  
		  System.out.println(salaryEmployees);
System.out.println("********print the only salary to the employeer *****888");

		    employeeList.stream().map(x->x.getSalary()).sorted().forEach(System.out::println);
		    System.out.println("******sorted empolyeer salary*******888");
		    employeeList.stream().map(x->x.getSalary()).sorted().forEach(System.out::println);
            employeeList.stream().map(x->x.getSalary()).filter(x->x>30000).forEach(System.out::println);


            
   		 List<String> s=Arrays.asList("qqm","mma","bbc","ccd","ppq");
   		s.stream().sorted().findFirst().ifPresent(System.out::println);//forEach(System.out::println);
   		
   		
   		
   		System.out.println("******sorted with name ***************");
   		//List <EmployeeData2> epmloyeesort1 = employeeList.stream().sorted(Comparator.comparing(EmployeeData2::getName))
   			//	.collect(Collectors.toList());
   		
   		//System.out.println(epmloyeesort1);
   		
   		List<EmployeeData> epmloyeesort = employeeList.stream().sorted((o1,o2)-> o1.getName().compareTo(o2.getName()))
   				.collect(Collectors.toList());
   	
   		System.out.println(epmloyeesort);
   		
   		// first Employee in the list
   		
   		EmployeeData employees2 = epmloyeesort.get(1);
   		
   		System.out.println(employees2);
   		
   		
   		
   		
   		  
   		
   		//employeeList.stream().filter(n->n.getName().startsWith("a");
   		
   		
   		System.out.println("Getting 3rd highest");
   		
   		List<Integer> list = Arrays.asList(0,3,10,15,1,40,30);
   	Integer SecH = list.stream().sorted(Collections.reverseOrder()).distinct().skip(2).findFirst().get();
   	System.out.println(SecH);
   	
   	
   	System.out.println("Sorting in descending order");
   	
	/*
	 * Optional<EmployeeData>
	 * empreverseorder=employeeList.stream().map(emp->emp.getName()
	 * .sorted(Collections.reverseOrder()).get();
	 */
   	
   	System.out.println("getting third highest salary");
   	
   	Optional <EmployeeData> emp = employeeList.stream().sorted(Comparator.comparingDouble(EmployeeData::getSalary)
   			.reversed()).distinct().skip(2).findFirst();
   	System.out.println(emp.get().getName());
    

	System.out.println("multiple sort ");
	
	
	List<EmployeeData> emp2 = employeeList.stream().sorted(Comparator.comparingDouble(EmployeeData::getSalary)
			.thenComparing(EmployeeData::getId)).collect(Collectors.toList());
   	System.out.println(emp2);
   	
   	int[] array = {9, 5, 2, 7, 3, 9, 7, 6, 1, 5};
   	
   	int thirdhighest = Arrays.stream(array).boxed().sorted(Comparator.reverseOrder()).
   			distinct().skip(2).findAny().orElse(-1);
   			
   			System.out.println(thirdhighest);
   	
   	

	
}}
