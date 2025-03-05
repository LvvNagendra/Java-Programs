package patterns;

public class pattern3 {

	public static void main(String[] args) {
		 int n=6;
		 int c=n-1;
		for (int i=1;i<n;i++) {
		
			for (int j=1;j<=c;j++) {
			
				System.out.print(" ");
			}
			c--;
			
			for (int j=1;j<=2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println();
			}
			
		
}}
	


