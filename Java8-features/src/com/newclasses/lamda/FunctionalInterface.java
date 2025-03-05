package com.newclasses.lamda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

interface Shape
{
	void display();
}



public class FunctionalInterface {

	public static void main(String[] args) {
		
		Shape rectangle = ()->System.out.println("This is display method");
		rectangle.display();
		// TODO Auto-generated method stub

		
		Consumer<String> consumer = s->System.out.println(s);
		consumer.accept("this is consoumer interface");
		
		
		List<Integer> mylist = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		mylist.stream().filter(n->n%2==0).forEach(System.out::println);
		
	}

}
