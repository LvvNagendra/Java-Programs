package collection;

class Value {
	private int i;

	public void setI(int i) {
		this.i = i;
	}

	public int getI() {
		return i;
	}

	private String name;

	public void setName(String name) {
		this.name = name;
	}

	public String getName(String name) {
		return name;
	}

	public String toString() {
		return "Value [i=" + i + ", name=" + name + "]";
	}

	public Value(int i, String name) {
	}
 }

class Getting {
	public static void main(String[] args) {
		Value value = new Value(0, null);
		value.setI(10);
		value.setName("Thread request");
		System.out.println(value.getI());
		System.out.println(value.getName("Only Thread"));
	}
 }

class ThreadTwo implements Runnable {
	Getting getting = new Getting();
	public void run() {
		System.out.println(getting);
	}
 }

public class ThreadEx1{
	public static void main(String[] args) {
		Value value1 = null;
		for (int b = 0; b < value1.getI(); b++) {
			System.out.println("One class:-" + " " + b);
			System.out.println("---------------------");
			while (b >= 4)
				break;
		}
		Thread thread = new Thread(new ThreadTwo());
		thread.start();
	}
 }

