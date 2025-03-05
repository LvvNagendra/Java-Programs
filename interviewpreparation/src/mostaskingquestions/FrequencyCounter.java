package mostaskingquestions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCounter {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 3, 3, 4, 1};
        Map<Integer, Integer> frequencyMap = new HashMap<>();

        // Counting the frequency of each number
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Printing the frequencies of numbers in the array
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Number " + entry.getKey() + " appears " + entry.getValue() + " times.");
        }
        
        Map<Integer, Long> numberCount = Arrays.stream(array)
                .boxed() // Convert int to Integer
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Occurrences: " + numberCount);
    }
}

