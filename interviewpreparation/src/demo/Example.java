package demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
	
	
	Integer a[]= {1,9,3};
	Integer b[]= {1,7,3};
	
	List<Integer> num=Arrays.stream(a).filter(n->Arrays.asList(b).contains(n)).collect(Collectors.toList());
	System.out.println(num);
	
}
}
