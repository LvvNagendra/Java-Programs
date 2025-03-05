package strings;




import java.util.Scanner;

public class Comparestring16 {

	public static void main(String[] args) {
	int a,b,count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter str1:");
	String s1=s.nextLine();
	System.out.println("ENTER A STR2");
	String s2=s.nextLine();
	a=s1.length();
	b=s2.length();
	char str1[]=s1.toCharArray();
	char str2[]=s2.toCharArray();
	if(a==b) {
		for (int i=0;i<a;i++) {
			if(str1[i]!=str2[i]) {
				 count=0;
				break;
			}
		}
	}
	else {
		count=0;
		
	}
	if (count==1) {
		System.out.println(s1+" ="+s2);
	}
	else {
		System.out.println(s1+"!="+s2);
	}
	
	

}
}
