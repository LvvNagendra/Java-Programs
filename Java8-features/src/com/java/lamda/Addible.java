package com.java.lamda;

interface AddibleImp {

	int addition(int a,int b);
}

	class Addible{
		
	public static void main(String[] args) {
		
		AddibleImp add =(a,b) -> (a+b);
		int result = add.addition(10,20);
		System.out.println(result);


	}
}