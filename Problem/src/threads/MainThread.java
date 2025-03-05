package threads;

class MyThread extends Thread {
    public void run() {
        // Code to be executed in the new thread
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread: " + i);
        }
        try {
        	System.out.println("thread in sleep");
        	Thread.sleep(5000);
        }catch(InterruptedException e) {
        	System.out.println(e.getMessage());
        }
    }
    
    
}

public class MainThread {
    public static void main(String[] args) {
    	MyThread thread1 = new MyThread();
    	MyThread thread2 = new MyThread();

        thread1.start(); // Starts the first thread
        thread2.run(); // Starts the second thread
    }
}
