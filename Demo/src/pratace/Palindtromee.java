package pratace;

public class Palindtromee {

	public static void main(String[] args) {
		int n= 10,sum =0,t=n;
		while(n>0)
		{
			int r = n%10;
			sum = (sum*10) + r;
			n=n/10;
		}
		if(sum==t)
		{
			System.out.println("P");
			
		}
		else
		{
			System.out.println("Not P");
		}
	}

}
