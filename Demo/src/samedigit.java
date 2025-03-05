import java.util.Scanner;
public class samedigit {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=s.nextInt();
		int digit=n%10;
		while(n!=0) {
			int current_digit=n%0;
			n=n/10;
			if(current_digit !=digit ) {
			System.out.println("no");	
			
		}
			else{
				System.out.println("yes");
			}
			
		
					
		}}}

	


