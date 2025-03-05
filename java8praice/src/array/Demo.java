package array;

public class Demo {

    public static void main(String[] args) {
        // Initialize two arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Call merge function
        int[] mergedArray = mergeArrays(array1, array2);

        // Print the merged array
        System.out.print("Merged Array: ");
        for (int i : mergedArray) {
            System.out.print(i + " ");
        }
    }

    public static int[] mergeArrays(int[] array1, int[] array2) {
        // Create a new array to hold the merged values
        int[] mergedArray = new int[array1.length + array2.length];

        // Copy elements from the first array
        for (int i = 0; i < array1.length; i++) {
            mergedArray[i] = array1[i];
        }

        // Copy elements from the second array
        for (int i = 0; i < array2.length; i++) {
            mergedArray[array1.length + i] = array2[i];
        }

        return mergedArray;
    }
}

