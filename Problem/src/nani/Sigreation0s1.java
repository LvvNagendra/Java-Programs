package nani;

public class Sigreation0s1 {

	public static void main(String[] args) {
//		int [] arr= { 0, 1, 0, 3,0, 4,2 };
//		int count=0;
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]==0) {
//				count++;
//			}
//		}
//		for(int j=0;j<=count;j++) {
//			arr[j] = 0;
//		}
//		
//		for(int i=count;i<arr.length;i++) {
//			arr[i]=1;
//			
//		}
//		 for (int i = 0; i < arr.length; i++) {
//	            System.out.print(arr[i] + " ");
//	    }
//		
//
//	}
//
//}
	 int[] arr = {0, 1, 0, 3, 0, 4, 2};
	    int count = 0;
	    
	    // Count the number of zeros in the array
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i] == 0) {
	            count++;
	        }
	    }
	    
	    // Move all occurrences of zeros to the beginning of the array
	    for (int i = 0; i < count; i++) {
	        arr[i] = 0;
	    }
	    
	    // Fill the rest of the array with numbers starting from 1
	    for (int i = count; i < arr.length; i++) {
	        arr[i] = i - count + 1;
	    }
	    
	    // Print the modified array
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i]+" ");
	    }
	}}
