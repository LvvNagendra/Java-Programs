package strings;
import java.util.Scanner;
public class Startcharstring {

	public static void main(String[] args) {
		Scanner s= new Scanner (System.in);
		System.out.println("enter a char:");
		char c=s.next().charAt(0);
		String a[]={"nagendra","krishna","uppu","umesh"};
		for(String i:a) {
			if(i.charAt(0)==c) {
				System.out.println(i);
			}
		}
		
	}

}
