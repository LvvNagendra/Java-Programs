package java8praice;

import java.util.Arrays;
import java.util.OptionalInt;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class MaxArray {

    public static void main(String[] args) {
        int[] numbers = {12, 56, 34, 89, 43, 67};

        // Find the maximum number
        OptionalInt max = Arrays.stream(numbers).max();

        if (max.isPresent()) {
            System.out.println("The maximum number is: " + max.getAsInt());

            // Find the second maximum number
            int maxValue = max.getAsInt();
            OptionalInt secondMax = Arrays.stream(numbers)
                .filter(n -> n < maxValue)  // Exclude the maximum value
                .max();

            if (secondMax.isPresent()) {
                System.out.println("The second maximum number is: " + secondMax.getAsInt());
            } else {
                System.out.println("There is no second maximum number (array might have all identical elements).");
            }
        } else {
            System.out.println("The array is empty.");
        }
    }
}


