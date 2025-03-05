 import java.util.Scanner;
public class perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,Sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number:");
		n =s.nextInt();
		
		for (int i=1;i<n;i++) 
		{
			if(n%i==0) 
			{
				Sum=Sum+i;
			}
		
		}
			if(Sum==n)  
			{
				System.out.format("is a Perfect Number",+ n);
			}
			else
			{
				System.out.format(" NOT a Perfect Number", +n);
			}
		}	
	}