package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AccurenceWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str="welcome to the world welcome world";

List<String> list=Arrays.asList(str.split(" "));
Map<String,Long> map=list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
System.out.println("java8"+map);

for(int i=0;i<str.length();i++) {
	List<Character> lists=Arrays.asList(str.charAt(i));


	
}


	}

}
