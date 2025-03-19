package java8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8ArrayProblems {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 2, 3, 4, 4, 5, 6};

        // 1. Sum of all elements
        int sum = Arrays.stream(numbers).sum();
        System.out.println("Sum: " + sum);

        // 2. Max and Min element
        int max = Arrays.stream(numbers).max().orElseThrow();
        int min = Arrays.stream(numbers).min().orElseThrow();
        System.out.println("Max: " + max + ", Min: " + min);

        // 3. Count occurrences of each element
        Map<Integer, Long> occurrences = Arrays.stream(numbers)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println("Occurrences: " + occurrences);

        // 4. Remove duplicates
        int[] distinctArray = Arrays.stream(numbers).distinct().toArray();
        System.out.println("Distinct: " + Arrays.toString(distinctArray));

        // 5. Sort ascending and descending
        int[] ascending = Arrays.stream(numbers).sorted().toArray();
        int[] descending = Arrays.stream(numbers).boxed().sorted(Collections.reverseOrder()).mapToInt(i -> i).toArray();
        System.out.println("Ascending: " + Arrays.toString(ascending));
        System.out.println("Descending: " + Arrays.toString(descending));

        // 6. First non-repeated element
        Integer firstNonRepeated = Arrays.stream(numbers).boxed()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1).map(Map.Entry::getKey).findFirst().orElse(null);
        System.out.println("First non-repeated: " + firstNonRepeated);

        // 7. First repeated element
        Set<Integer> seen = new HashSet<>();
        Integer firstRepeated = Arrays.stream(numbers).boxed()
                .filter(n -> !seen.add(n)).findFirst().orElse(null);
        System.out.println("First repeated: " + firstRepeated);

        // 8. Filter even and odd numbers
        List<Integer> evens = Arrays.stream(numbers).filter(n -> n % 2 == 0).boxed().collect(Collectors.toList());
        List<Integer> odds = Arrays.stream(numbers).filter(n -> n % 2 != 0).boxed().collect(Collectors.toList());
        System.out.println("Evens: " + evens);
        System.out.println("Odds: " + odds);

        // 9. Elements greater than a given number
        List<Integer> greaterThanThree = Arrays.stream(numbers).filter(n -> n > 3).boxed().collect(Collectors.toList());
        System.out.println("Greater than 3: " + greaterThanThree);

        // 10. Average of all numbers
        double average = Arrays.stream(numbers).average().orElse(0);
        System.out.println("Average: " + average);

        // 11. Second largest and second smallest
        int secondLargest = Arrays.stream(numbers).distinct().boxed().sorted(Collections.reverseOrder()).skip(1).findFirst().orElseThrow();
        int secondSmallest = Arrays.stream(numbers).distinct().sorted().skip(1).findFirst().orElseThrow();
        System.out.println("Second largest: " + secondLargest);
        System.out.println("Second smallest: " + secondSmallest);

        // 12. Product of all elements
        int product = Arrays.stream(numbers).reduce(1, (a, b) -> a * b);
        System.out.println("Product: " + product);

        // 13. Square every element
        int[] squares = Arrays.stream(numbers).map(n -> n * n).toArray();
        System.out.println("Squares: " + Arrays.toString(squares));

        // 14. Double every number
        List<Integer> doubled = Arrays.stream(numbers).map(n -> n * 2).boxed().collect(Collectors.toList());
        System.out.println("Doubled: " + doubled);

        // 15. Convert array to list
        List<Integer> numberList = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        System.out.println("Array to List: " + numberList);

        // 16. Top 3 largest numbers
        List<Integer> top3 = Arrays.stream(numbers).distinct().boxed().sorted(Collections.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println("Top 3 largest: " + top3);

        // 17. Check if two arrays are equal
        int[] anotherArray = {1, 2, 3, 4, 5, 6};
        boolean arraysEqual = Arrays.equals(numbers, anotherArray);
        System.out.println("Arrays equal: " + arraysEqual);

        // 18. Rotate array right by 2 positions
        int k = 2;
        int[] rotated = IntStream.range(0, numbers.length)
                .map(i -> numbers[(i - k + numbers.length) % numbers.length])
                .toArray();
        System.out.println("Rotated array: " + Arrays.toString(rotated));

        // 19. Check if array contains a number
        boolean containsFive = Arrays.stream(numbers).anyMatch(n -> n == 5);
        System.out.println("Contains 5: " + containsFive);

        // 20. Pairs adding up to target
        int target = 6;
        Set<List<Integer>> pairs = new HashSet<>();
        Arrays.stream(numbers).boxed().forEach(n -> {
            int diff = target - n;
            if (numberList.contains(diff) && diff != n) {
                pairs.add(Arrays.asList(n, diff));
            }
        });
        System.out.println("Pairs summing to 6: " + pairs);
    }
}
