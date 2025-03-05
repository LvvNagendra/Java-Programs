
import java.util.*;

public class Range {

	public static void main(String[] args) {
		
        Scanner oy = new Scanner(System.in);
     
        System.out.println("Enter the value between 1 to 10 :");
        int n = oy.nextInt();
        
        if (n>=1 && n<=10)
        {
            System.out.println("It is in range");
        }
        else
        {
            System.out.println("It is out of range");
        }
	}

}
