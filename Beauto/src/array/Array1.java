package array;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter a number");
		int element=input.nextInt();
		int[] array=new int[element];
		/*for (int i=0;i<element;i++) {
			System.out.println("enter a number:");
			array[i]=input.nextInt();
		}*/
		
		int max=array[0];
		int min=array[0];
		for (int i=0;i<element;i++) {
			array[i]=input.nextInt();
			if(array[i]>max) {
				max=array[i];
				}
			if(array[i]<min) {
				min=array[i];
			
			
		}
		
		
	}
		System.out.println("the max num:"+max);
		System.out.println("the min num:"+min);

}}
