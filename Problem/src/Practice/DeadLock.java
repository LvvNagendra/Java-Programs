package Practice;

public class DeadLock {

	public static void main(String[] args) {
	String r1="nagendra";
	String r2="binnu";
	Thread t1= new Thread() {
	public void run(){
		synchronized (r1) {
			System.out.println("threa1 :r1");
			try {
				Thread.sleep(100);
			}catch(Exception e){
				
			}
			synchronized (r2) {
				System.out.println("threa1 :r2");
		}
		
	}
	}
	};
	Thread t2 = new Thread() {
		public void run() {
			synchronized (r2) {
				System.out.println("threa2 :r2");
				try {
					Thread.sleep(100);
				}catch(Exception e){
					
				}
				synchronized (r1) {
					System.out.println("threa2 :r1");
			}
			}
		}
	};
	
	t1.start();
	t2.start();
	
	}

}
