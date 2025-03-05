package problems;

public class Productsum {

	public static void main(String[] args) {
		int p=1,sum=0;
		int n = 4421;
	
		while(n>0) {
		
		int r= n%10;
		p= p*r;
		sum= sum+r;
		n=n/10;
		
		}
		int ans=p-sum;
		System.out.println(ans);
		

	}

}
