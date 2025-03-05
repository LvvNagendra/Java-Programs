package strings;
import java.util.Scanner;
public class occurancestring {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:");
		String b=s.nextLine();
		
		System.out.println("enter char");
		char a=s.next().charAt(0);
		int count=0;
		for(int i=0;i<b.length();i++ ) {
			if(b.charAt(i)==a) {
				count++;
			}
			
		}System.out.println(count);
		
		
	}

}
