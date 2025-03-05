package pratace;

public class Nperfect {

	public static void main(String[] args) {
		int p=0;
		for(int i=1;p<3;i++)
		{
			int sum=0;
			for(int j=1;j<i;j++)
			{
				if (i%j==0)
				{
					sum =sum+j;
				}
			}
		if (sum==i)
		{
			System.out.println(i);
			p++;
		}
		}
	}
}



