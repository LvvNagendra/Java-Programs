import java.util.Scanner;
public class rank {

	public static void main(String[] args) {
		System.out.println( "check grade of student:");
		Scanner s=new Scanner(System.in);
		int marks=s.nextInt();
		if((marks>80)&&(marks<=100))
		System.out.println("A grade");
		else if((marks>60)&&(marks<=80))
			System.out.println("B grade");
		else if((marks>50)&&(marks<=60))
			System.out.println("c grad");
			else
				System.out.println("fail");
			
	}
}
