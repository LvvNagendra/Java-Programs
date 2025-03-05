package nani;

public class Demo {

    public static void main(String[] args) {
        int[] arr = {8, 6, 8, 3, 5};
        
        // Initialize min and max with the first element of the array
        int min = arr[0];
        int max = arr[0];
        
        // Find the maximum value
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        
        // Find the second maximum value
        Integer secondMax = null;
        for (int i : arr) {
            if (i != max) {
                if (secondMax == null || i > secondMax) {
                    secondMax = i;
                }
            }
        }
        
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
        if (secondMax != null) {
            System.out.println("Second maximum value: " + secondMax);
        } else {
            System.out.println("No second maximum value found.");
        }
    }
}
