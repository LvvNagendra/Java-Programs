package Practice;

import java.util.function.BinaryOperator;

public class Swapping {

	public static void main(String[] args) {
//		int a =25;
//		int b=26;
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		System.out.println(a);
//		System.out.println(b);
//		int a,b,c;
//		a=25;
//		b=26;
//		c=a;
//		a=b;
//		b=c;
//		System.out.println(a);
//		System.out.println(b);
		
		BinaryOperator<Integer> add = (a, b) -> a * b;
		int result = add.apply(2, 3);
		System.out.println(result);
	}

}
