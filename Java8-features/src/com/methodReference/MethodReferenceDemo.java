package com.methodReference;

import java.util.function.BiFunction;
import java.util.function.Function;


interface Printable{
	void print(String msg);
}


public class MethodReferenceDemo {
	
	public static int addition(int a, int b)
	{
		return (a+b);
	}

	public void display(String msg){
		
		msg=msg.toUpperCase();
		System.out.println(msg);
	}

	public static void main(String[] args) {
		
		//method reference using static method
		//sqrt is static method
		
		Function<Integer,Double> function = (input)-> Math.sqrt(input);
		System.out.println(function.apply(64));
		
		//using method reference
		
		Function<Integer,Double> function2 = Math::sqrt;
		System.out.println(function2.apply(81));
		
		// creating own static method addition
		
		BiFunction<Integer, Integer, Integer> methodAdd = (a,b)->MethodReferenceDemo.addition(a, b);
		System.out.println(methodAdd.apply(10,20));
		
		// Using method refrence
		
		BiFunction<Integer, Integer, Integer> methodAdd2 = MethodReferenceDemo::addition;
		System.out.println(methodAdd2.apply(40,20));
		
		
		// creating interface and display method 
		
		MethodReferenceDemo methodReferenceDemo = new MethodReferenceDemo();
		Printable printable = (msg)->methodReferenceDemo.display(msg);
		printable.print("Hello World");
		
		//using method reference 
		
		Printable printable2 = methodReferenceDemo::display;
		printable2.print("This is method reference");
		
	}

}
