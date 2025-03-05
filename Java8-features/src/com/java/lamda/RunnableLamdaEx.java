package com.java.lamda;

/*class ThreadDemo implements Runnable
{

	@Override
	public void run() {
		System.out.println("Run method called....");
		
	}
	
}*/
public class RunnableLamdaEx {

	public static void main(String[] args) {

		/*
		 * Thread thread = new Thread(new ThreadDemo());
		 * 
		 * thread.start();
		 */
		
		Thread threadlamda = new Thread(() ->System.out.println("Run method called using lamda.."));
		
		threadlamda.start();
		
		
	}

}
