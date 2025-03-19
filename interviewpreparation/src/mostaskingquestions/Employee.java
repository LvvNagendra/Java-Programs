package mostaskingquestions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


	
	class Emp{
		
		

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
			return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}
		public Emp(int id, String name, double salary) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
		}
	}
	public class Employee {

	public static void main(String[] args) {
		
		List<Emp> list= Arrays.asList(
	            new Emp(1, "Nagendra", 200),
	            new Emp(2, "Boneeth", 300),
	            new Emp(3, "Vikas", 800)
	        );
		list.stream().sorted(Comparator.comparingDouble(Emp::getSalary).reversed()).skip(1).findFirst()
		.ifPresentOrElse(emp->System.out.print(emp), ()->System.out.println("error"));
		
	
	}

}
