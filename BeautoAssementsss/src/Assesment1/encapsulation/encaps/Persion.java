package Assesment1.encapsulation.encaps;

public class Persion {
	public String name="nani";
	public int age=21;
	public String gender="male";
	
	
	




	public Persion(String string, int i, String string1) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		
		// TODO Auto-generated constructor stub
	}




	public Persion() {

		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getName() {
		return name;
	}


	

	public int getAge() {
		return age;
	}




	public String getGender() {
		return gender;
	}


	


	@Override
	public String toString() {
		return "Persion [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}




	
	
	

}
