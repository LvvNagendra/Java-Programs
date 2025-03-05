import java.util.Scanner;
public class tabledowhileloop {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=s.nextInt();
		int i=1;
		do {
			System.out.println(n+"*"+i+"="+i*n);
			i++;
		}
		while(i<=10);
		
	}

}
