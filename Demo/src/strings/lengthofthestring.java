package strings;
import java.util.Scanner;
public class lengthofthestring {

	public static void main(String[] args) {
		/*String s="nagendra";
		s+='\0';
		int len=0;
		while(s.charAt(len)!='\0') 
		{
			len++;
		}
		System.out.println("your string is:"+len);*/
		//System.out.println(s.length());
		
		/*int c=0;
       Scanner Dr = new Scanner(System.in);
       System.out.println("Enter the value of String");
       String s=Dr.nextLine();
       
      for (char ch:s.toCharArray())
       //for(String s1:s.split(" "))
              {
    	   c++;
       }
       System.out.println("the lenth of the String is : "+c);*/
		String s="nani";
		int c=0;
		for(char b:s.toCharArray())
		{
		c++;
		}
		System.out.println("lenhth:"+c);
	}

}
