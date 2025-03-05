package stringss;

public class StrI {

	public static void main(String[] args) {
		String str = "welcome to beauto";
        String revstr="";
        for(int i=str.length();i>0;i--)
        {
            revstr= revstr+str.charAt(i-1);
        }
        System.out.println("Reversed String : "+revstr);
		
		
	}}


