import java.util.Scanner;
public class Pattern2 {

	public static void main(String[] args) {
		int i,j;
		Scanner s=new Scanner (System.in);
		System.out.println("enter a number:");
		int n =s.nextInt();
		for ( i=1;i<=n;i++)
		{
			for(  j=1;j<=n-i;j++)
			{
				System.out.printf(" ");	
			}
			for (j=i;j>0;j--) 
			{
			System.out.printf("%d",j);
			}
			for(j=2;j<=i;j++) 
			{
				System.out.printf("%d",j);
			}
			System.out.println();
		
	
		}

		}
}

