package com.newclasses.lamda;

public class RunnableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	Runnable runnable = ()-> System.out.println("This is runnable method");
	Thread thread = new Thread (runnable);
	thread.start();


	}

}
