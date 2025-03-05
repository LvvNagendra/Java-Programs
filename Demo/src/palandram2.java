import java.util.Scanner;
public class palandram2 {

	public static void main(String[] args) {
			int r,sum=0;
			
				Scanner s=new Scanner(System.in);
				System.out .println("enter a number:");
				int n=s.nextInt();
				int temp=n;
				while(n>0) {
					r=n%10;
					n=n/10;
					sum=(sum*10)+r;
					
				}
				if(temp==sum) {
				System.out.println("palamdram");
				

	}
				else {
					System.out.println("notpalandram");
				}
}
}