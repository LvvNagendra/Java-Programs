package patterns;

public class CreossLinePatteren {

	public static void main(String[] args) {
//		int n=5;
//		 for (int i = 0; i < n; i++) {
//	            for (int j = 0; j < n; j++) {
//	                // Check if the sum of row index (i) and column index (j) is even
//	                if (i==j) {
//	                    System.out.print("*");
//	                } 
//	            }
//	            System.out.println();
//	        }
	
		        int n = 5;

		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < n; j++) {
		                // Check if the row index (i) is equal to the column index (j)
		                if (i == j) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }
		        for (int i = 0; i < n; i++) {
		            for (int j = 0; j < n; j++) {
		                // Check if the row index (i) is equal to the column index (j)
		                if (i + j==6) {
		                    System.out.print("*");
		                } else {
		                    System.out.print(" ");
		                }
		            }
		            System.out.println();
		        }

}}
