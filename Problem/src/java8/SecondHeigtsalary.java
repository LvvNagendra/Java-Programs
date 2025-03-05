package java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SecondHeigtsalary {

	public static void main(String[] args) {
		  List<Integer> list = Arrays.asList(13, 4, 56, 7, 8, 9);
		Optional<Integer> secondHighest = list.stream()
                .sorted(Comparator.reverseOrder()) // Sort in descending order
                .skip(1) // Skip the highest number
                .findFirst(); // Get the second highest number

        // Check if the second highest number is present
        if (secondHighest.isPresent()) {
            System.out.println("The second highest number is: " + secondHighest.get());
        } else {
            System.out.println("There is no second highest number.");
        }
    }
}
