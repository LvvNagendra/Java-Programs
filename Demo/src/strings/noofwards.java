package strings;
import java.util.Scanner;


public class noofwards {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String s= sc.nextLine();
		int count=1;
		for(int i=0;i<=s.length()-1;i++) {
			if((s.charAt(i)==' ')/* && (s.charAt(i+1)!=' ')*/)
			{
			count++;
		}
		
	}
		System.out.println(count);
		System.out.println(s.length());

}}
