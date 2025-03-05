package Practice;

import java.util.Scanner;

public class Marks {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int j=0;j<n;j++) {
			if(arr[j] > 0 && arr[j] <=40) {
				System.out.println("U");
			}
			else if(arr[j] >41 && arr[j] < 50){
				System.out.println("D");
	
			}
			else if(arr[j]>51 && arr[j] < 60) {
				System.out.println("C");
				
			}
			else if(arr[j] >61 && arr[j] <70) {
				System.out.println("B");
			}
			else if(arr[j] >71 &&  arr[j] < 80) {
				System.out.println("B+");
			}
			else if(arr[j] >81 && arr[j] <90) {
				System.out.println("A");
			}
			else if(arr[j] >91 && arr[j] <100) {
				System.out.println("S");
			}
			else {
				System.out.println("Invalid input");
			}
		}
	}

}
