
public class Nprimenumber {

	public static void main(String[] args) {
		int p=0;
		for (int i=2;p<100;i++) 
		{
			
			 int count=0;
			for (int j=1;j<=i;j++) {
				 
				if(i%j==0) {
					count++;
				     break;
					
				}
			}
			if (count==2) {
				System.out.println(i);
				p++;
			
			}
		}
	}

}
