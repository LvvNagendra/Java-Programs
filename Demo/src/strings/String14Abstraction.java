package strings;
abstract class shape{
	abstract void  numberOfSides();
}
class Trapezoid extends shape
{
	void numberOfSides() {
	
	System.out.println("number of sides of trapezoid are :4 ");
	}}
class Triangle extends shape
{
	void numberOfSides()
	{
		System.out.println("number of sides of triangle are:3");
	}
	}
class Hexagon extends shape
{
	void numberOfSides() {
		System.out.println("number of Sides of Hexagon are:6");
	}
	
}
	


public class String14Abstraction {

	public static void main(String[] args) {
	shape a =new Trapezoid();
	shape b =new Triangle();
	shape c =new Hexagon();
	a.numberOfSides();
	b.numberOfSides();
	c.numberOfSides();
	
	

	}

}
