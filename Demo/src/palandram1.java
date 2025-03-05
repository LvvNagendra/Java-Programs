import java.util.Scanner;
public class palandram1 {

	public static void main(String[] args) {
		int r,sum=0,temp;
		Scanner s=new Scanner(System.in);
		System.out .println("enter a number:");
		int n=s.nextInt();
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		
		}
		if (temp==sum)
			System.out.print(temp+" is palindrame number ");
		else
			System.out.print(temp+" is  not palindrame number ");
		
		// TODO Auto-generated method stub

	}

}
