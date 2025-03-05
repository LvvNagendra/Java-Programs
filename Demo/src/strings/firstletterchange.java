package strings;
import java .util.Scanner;
class firstletterchange{
public static void main(String[] args) {
	//Scanner s=new Scanner(System.in);
	//System.out.println("enter a string:");
	//String a=s.nextLine();
	String s="nagendra";
	char b[]=s.toCharArray();
	for(int i=0;i<b.length;i++) {
		b[0]=b[b.length-1];
		if(b[i]==' '){
			b[i+1]=b[i-1];
			
		}
		System.out.print(b[i]);
	}
	
	
	        }
	
	}


