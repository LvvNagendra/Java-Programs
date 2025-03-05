package threads;

public class ThreadEx {

	public static void main(String[] args) {
		 // Simulating a time-consuming task
        for (int i = 0; i < 5; i++) {
            System.out.println("Processing task... Step " + (i + 1));
            try {
                Thread.sleep(20000); // Simulating some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Async task completed!");

	}

}
