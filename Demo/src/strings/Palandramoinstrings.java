package strings;
import java.util.*;

public class Palandramoinstrings {

	public static void main(String[] args) {
		int c=0, n;
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=s.nextLine();
		 String word=str.toLowerCase();
		 String[] words=str.split(" ");
		for (int i=0;i<=word.length()-1;i++) {
			for(int j=str.length()-1;j>=word.length()-1;j++) {
				
				if(str.charAt(i)==str.charAt(j)) {
					System.out.println("palamdram");
				}
				else {
					System.out.println("not palamdram");
					c++;
				}
			}
			
		}
		
		
	
		
		
	}

}
