package strings;
import java.util.*;

public class Stringrevershw {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string word: ");
		String str= s.nextLine();
		String[] words=str.split(" ");
		String reverseString="";
		for (int i=0;i<words.length;i++) {
			String word =words[i];
			
		String reverseWord="";
		for(int j=word.length()-1;j>=0;j--) {
			reverseWord=reverseWord+word.charAt(j);
		}
		reverseString= reverseString+reverseWord+" ";
		
		}
		System.out.println(reverseString);
	}

}
