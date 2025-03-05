import java.util.Scanner;
public class TIME {

	public static void main(String[] args) {
		System.err.println("emter a hour: ");
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		int minute,seconds;
		minute=n*60;
		seconds=n*3600;
		System.out.println("+minute"+minute+"+seconds"+seconds);

	}

}
