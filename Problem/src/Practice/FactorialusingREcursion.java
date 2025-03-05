package Practice;

public class FactorialusingREcursion {

	public static void main(String[] args) {
		int n=5;
		int fact=fact(n);
		System.out.println("factor of  "+n +" is  :"+ fact);

	}
	public static int fact(int n) {
		if(n==1) {
			return n;	
		}
		return n* fact(n-1);//5*4*3*2*1=120
		
		
	}

}
