package com.java.lamda;

import java.util.function.Consumer;

class consumerImp implements Consumer<String>

{

	@Override
	public void accept(String input) {
		
		System.out.println(input);
		// TODO Auto-generated method stub
		
	}
	
}
public class ConsumerInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Consumer<String> cons = new consumerImp();
		cons.accept("This is Consumer Interface..");*/
		
		
		Consumer<String> cons = (input) -> System.out.println(input);
		cons.accept("This is Consumer Interface..");


}
}
