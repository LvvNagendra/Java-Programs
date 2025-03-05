package threads;

public class TreadsCreation {
	public static void main(String[] args) {
		ThreadClass thread = new  ThreadClass();
		thread.start();
		RunnableInterface renable=new RunnableInterface();
		Thread thread2=new Thread(renable);
		thread2.start();
	}

}
