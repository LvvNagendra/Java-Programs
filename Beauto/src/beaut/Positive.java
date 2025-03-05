package beaut;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		int n;
		//int n=-5;
		Scanner s= new Scanner(System.in);
		System.out.println("enter a number");
		n= s.nextInt();
	
		if (n>0) {
			System.out.println("positive number");
			
		}
		else {
			System.out.println(" nagitive number");
		}
	}

}
