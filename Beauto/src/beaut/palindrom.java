package beaut;

public class palindrom {

	public static void main(String[] args) {
		int n=4554,sum=0,t=n;
		while(n>0) {
			int r=n%10;
			n=n/10;
			sum=(sum*10)+r;
			
		}
		if(sum==t) {
			System.out.println("palindrom");
			
		}
		else {
			System.out.println("not palindram");
		}

	}

}
