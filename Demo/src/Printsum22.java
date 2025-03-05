import java.util.Scanner;
public class Printsum22 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("ENTER A NUM");
		int n=s.nextInt();
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			
			sum=sum+(float)1/Math.pow(2, i);
		}
		System.out.println(sum);
			
		}
		
		
	}


