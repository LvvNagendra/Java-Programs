package Practice;

public class ShiftZeros {
	 public static void main(String[] args) {
	        int[] arr = { 1, 0, 3, 6, 0, 9, 0 };
	        int n = arr.length;
	        
	        // Traverse the array and move all non-zero elements to the left side
	        int count = 0; // keeps track of the number of non-zero elements
	        for (int i = 0; i <n; i++) {
	            if (arr[i] != 0) {
	                arr[count] = arr[i];
	                count++;
	            }
	        }
	        
	        // Fill the remaining positions with zeros
	        while (count < n) {
	            arr[count] = 0;
	            count++;
	        }
	        
	        // Print the shifted array
	        for (int i = 0; i < n; i++) {
	            System.out.print(arr[i] + " ");
	        }
	    }

}
