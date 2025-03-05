package pratace;

public class Nprimee {

	public static void main(String[] args) 
	{
		int p=0;
		for(int i=1;p<=9;i++)
		{
			int count = 0;
			for(int j=1;j<=i;j++)
			{
				if (i%j==0)
				{
					count++;
				}
			}
		if (count==2)
		{
			System.out.println(i);
			p++;
		}
		}
		
	}

}
