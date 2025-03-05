package Practice;

public class Test3 {

	public static void main(String[] args) {
		   int n = 5; // Change this value to control the number of rows

	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                if ((i + j) % 2 == 0) {
	                    System.out.print("1");
	                } else {
	                    System.out.print("0");
	                }
	            }
	            System.out.println(); // Move to the next line after each row
	        }
	}

}
