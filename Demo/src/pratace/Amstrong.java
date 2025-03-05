package pratace;

public class Amstrong {
	public static void main(String[] args) {
		int n= 153,sum =0,t=n;
		while(n>0)
		{
			int r = n%10;
			sum = sum + r*r*r;
			n=n/10;
		}
		if(sum==t)
		{
			System.out.println("Armstrong");
			
		}
		else
		{
			System.out.println("Not Armstrong");
		}
	}

}
