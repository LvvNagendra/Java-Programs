package beaut;
class Animal{  
void place(){
	System.out.println("forest");
}  
}  
class Lion extends Animal{  
void drink(){
	System.out.println("water");
	}  
}  
class Cat extends Animal
{  
void colour(){
	System.out.println(" white");}  
}  

public class Inheritance {

	public static void main(String[] args) {
		Cat c=new Cat();  
		c.place();  
		c.colour();
		Lion d=new Lion();
		d.place();

	}

}
