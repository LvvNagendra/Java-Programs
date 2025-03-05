import java.util.Scanner;
public class Printsum21 {

	public static void main(String[] args) {
		float sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num:");
		int n=s.nextInt();
		
		for(int i=1;i<n;i++) 
		{
			sum=sum+(1/(float)i);
			System.out.println(sum);
		}
		
		

	}

}
