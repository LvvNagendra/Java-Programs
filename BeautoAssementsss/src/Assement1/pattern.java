package Assement1;

import java.util.Scanner;

public class pattern {
	public static void main(String[] args) {
		int n,i,j,space=1;
		System.out.println("enter a number: ");
		Scanner s= new Scanner(System.in);
		n=s.nextInt();
	
	  
	       
        for(i=1; i<=n; i++) 
        {
       for(j=2*(n-i); j>=0; j--)
           {           
	                System.out.print(" "); 
	            } 
	            for(j=1; j<=i; j++) 
	            {       
	                System.out.print("* "); 
	            }           
	            System.out.println(); 
	        } 
	    } 


	
		
		
		 

		

	}


