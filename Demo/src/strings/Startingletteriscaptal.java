package strings;
import java.util.Scanner;
public class Startingletteriscaptal {




	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
				System.out.println("enter my string:");
				String str=s.nextLine();
				String b=str.replaceAll("","");
				String[] word =b.split(" ");
				for(String words:word)
		{
		System.out.print(words.substring(0,1).toUpperCase()+words.substring(1,words.length())+" ");
		
		
	}

}}
