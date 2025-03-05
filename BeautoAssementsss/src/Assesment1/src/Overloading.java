package Assesment1.src;


public class Overloading {

	public static void main(String[] args) {
		System.out.println("area of rectiangle:  "+area(5,10));
		System.out.println("area of square:  "+area(5,5));


	}
	public static  int area(int length ,int width){
		return length*width;
		
	}
	public static double area(double length ,int width){
		return length*width;
		
	}

}
