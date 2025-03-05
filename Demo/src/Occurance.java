import java.util.Scanner;
public class Occurance {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a num:");
		int n=s.nextInt();
		System.out.println("enter a digit");
		int d=s.nextInt();
		int count=0;
		while(n>0) {
			int rem=n%10;
			if(rem==d) 
			count++;
			n/=10;
			}
		System.out.println(count);
		s.close();
		}
		
	
	}
	


