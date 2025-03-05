package java8;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterOccurrence {
    public static void main(String[] args) {
        String str = "nage ndra";

        // Using chars() to get character occurrences
        Map<Character, Long> occu = str.chars()
                .mapToObj(ch -> (char) ch) // Convert each int to char
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())); // Group by character and count

        System.out.println(occu);
    }
}

