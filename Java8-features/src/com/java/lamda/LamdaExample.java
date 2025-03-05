 package com.java.lamda;

interface Shape
{
	void area();
}



public class LamdaExample {

	public static void main(String[] args) {
		
		Shape rectangle = () -> System.out.println("Area of rectacangle");
		rectangle.area();
		
		Shape sqaure = () -> System.out.println("Area of sqaure");
		sqaure.area();
		
	}
}
