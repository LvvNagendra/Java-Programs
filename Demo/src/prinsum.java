import java.util.Scanner;
public class prinsum {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num :");
		int n=s.nextInt();
		double sum=0;
	
		for( int i=1;i<=n;i++) 
		{
			sum=sum+1/i;
		}
		System.out.println(sum);
		

}
}
