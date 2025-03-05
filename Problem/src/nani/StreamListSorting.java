package nani;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

 class Employees {
    private int id;
    private String name;
    private int age;
    private long salary;
    public Employees(int id, String name, int age, long salary) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", salary=" + salary + "]";
    }
}
public class StreamListSorting {
    public static void main(String[] args) {

        // sort employee by salary in ascending order
        List < Employees > employees = new ArrayList < Employees > ();
        employees.add(new Employees(10, "Ramesh", 30, 400000));
        employees.add(new Employees(20, "John", 29, 350000));
        employees.add(new Employees(30, "Tom", 30, 450000));
        employees.add(new Employees(40, "Pramod", 29, 500000));



        List < Employees > employeesSortedList1 = employees.stream()
            .sorted(Comparator.comparingLong(Employees::getSalary)).collect(Collectors.toList()); //ascending order
        System.out.println(employeesSortedList1);
    
    List < Employees > employeesSortedList2 = employees.stream()
            .sorted(Comparator.comparing(Employees::getName)).collect(Collectors.toList()); //ascending order
        System.out.println(employeesSortedList2);
    }
}
