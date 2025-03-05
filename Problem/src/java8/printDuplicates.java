package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class printDuplicates {

	public static void main(String[] args) {
	List<Integer> list=Arrays.asList(1,2,3,4,3,4,5,6,7,8);

	Set<Integer> set= new HashSet<Integer>();
	List<Integer> set1= new ArrayList<Integer>();
	
	//dupulicate
	
	List<Integer> l=list.stream().map(a->a).distinct().collect(Collectors.toList());
	System.out.println(l);
	
	//list.stream().filter(x->!set.add(x)).forEach(x->System.out.print(x+" "));
	//list.stream().filter(x->set.add(x)).forEach(x->System.out.print(x));
	//list.stream().limit(3).forEach(x->System.out.println(x));
 //list.stream().skip(4).forEach(x->System.out.print(x));
	//list.stream().skip(2).limit(2).forEach(x->System.out.print(x));
//	Arrays.asList(1,2,3,4,5,6,7,8,9).stream().map(a->a*a).filter(b->b>9).forEach(c->System.out.println(c));
//	Arrays.asList(1,2,3,4,5,6,7,8,9).stream().filter(a->a%2==0).filter(a->a<=6).forEach(System.out::print);
//	Integer[]list1= {1,2,3,4,3,5,6,5};
	//List<int[]> li = Arrays.asList(list1);
	
	}

}
