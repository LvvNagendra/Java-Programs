import java.util.Scanner;
public class sumeven {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number:");
		int n= s.nextInt();
		int sum=0;
		for(int i=2;i<=n;i++) {
			if(i%2==0){
				sum=sum+i;
					}
		}
		System.out.println(sum);

	}

}
