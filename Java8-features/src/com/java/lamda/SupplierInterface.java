package com.java.lamda;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/*class SupplierImp implements Supplier<LocalDateTime>
{

	@Override
	public LocalDateTime get() {
		// TODO Auto-generated method stub
		return LocalDateTime.now();
	}
	
}*/
public class SupplierInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Supplier <LocalDateTime> supp = new SupplierImp();
		 * System.out.println(supp.get());
		 */
		
		Supplier <LocalDateTime> supp = () -> LocalDateTime.now();
		System.out.println(supp.get());
		
		Supplier<String> myString = ()-> "Hi this is supplier Interface";
		
		System.out.println(myString.get());
		
		List<String> supplier = Arrays.asList("a","b");
		
		System.out.println(supplier.stream().findAny().orElseGet(myString));
		
		
		
		System.out.println("WITHOUT ARGUMENT");
        List<String> supplier2 = Arrays.asList();
		
		System.out.println(supplier2.stream().findAny().orElseGet(myString));
		
	}

}
