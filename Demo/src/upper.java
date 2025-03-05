import java.util. Scanner;
public class upper {

	public static void main(String[] args) {
		
		System.out.println("check character uppercase:");
		Scanner s= new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(Character.isUpperCase(ch)) {
			
			System.out.println("upper case");
				}
		  else if (Character.isLowerCase(ch)){
			System.out.println("lower case");
		  }
			 else 
				System.out.println("specal symbols");
				
			}
		

	}

