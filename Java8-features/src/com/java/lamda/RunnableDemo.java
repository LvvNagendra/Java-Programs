package com.java.lamda;

class RunnableEx implements Runnable{

	@Override
	public void run() 
	{		
		
		System.out.println("In Run method");
	}
	
}

public class RunnableDemo {

	public static void main(String[] args) 
	{	
		Thread thread= new Thread(new RunnableEx());
		thread.start();
		
		Thread lamdathread = new Thread(()->System.out.println("Thread running using Lamda"));
		lamdathread.start();
	}

}
