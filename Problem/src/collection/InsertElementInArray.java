package collection;

import java.util.Scanner;

public class InsertElementInArray {
    public void insertArray(){
        try {
            int[] arr = new int[5];
            System.out.println("Enter the element of array");
            Scanner scanner = new Scanner(System.in);

            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            System.out.println("Printing elements before insert");

            for (int i : arr) {
                System.out.println(i);
            }

            System.out.println("Enter the location for storing element value");
            int location = scanner.nextInt();

            System.out.println("Enter the value that which ou want to insert");
            int value = scanner.nextInt();

            for (int i = arr.length - 1; i > location; i--) {
                arr[i] = arr[i - 1];
            }
            arr[location] = value;

            for (int i : arr) {
                System.out.println(i);
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("maximum array size is 5 i.e 0 to 4");
        }
    }


    public static void main(String[] args) {
        InsertElementInArray insertElementInArray = new InsertElementInArray();
        insertElementInArray.insertArray();
    }

}
