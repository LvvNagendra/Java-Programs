package java8;

import java.util.Arrays;
import java.util.List;

public class ReduceExample {
public static void main(String[] args) {
	List<Integer> nubers =Arrays.asList(1,2,3,4,5);	
	int nuber =nubers.stream().reduce(0,Integer::sum);
	System.out.println(nuber);
}
}
