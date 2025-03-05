package Practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//        // Using streams to filter even numbers and collect them into a new list
//        List<Integer> evenNumbers = numbers.stream()
//                                            .filter(z -> z % 2 == 0)
//                                            .collect(Collectors.toList());
//        List<Integer> odd=numbers.stream().filter(n-> n%2!=0).collect(Collectors.toList());
//        								
//
//        System.out.println("Original list: " + numbers);
//        System.out.println("Even numbers: " + evenNumbers);
//        System.out.println("odd numbers: "+ odd);
		
		        List<Integer> list=Arrays.asList(1,2,3,4,5,6,7,8,9);
		        List<Integer> even=list.stream().filter(n->n%2==0).collect(Collectors.toList());
		        System.out.println(even);
		    
    }
}
