package pratace;

public class Fibonacchii {

	public static void main(String[] args) {
		int n1=0,n2=1,n3;
		
//		System.out.println(n1+n2);
		for(int i =0;i<=5;i++)
			{
			
				n3=n1+n2;
				n1=n2;
				n2=n3;
				
				System.out.println(n3);
				
}
	}

}
