package java8;
//@FunctionalInterface
interface F{
	public int multiple(int a,int b);
	
}

public class Fuctionalinterface {

	public static void main(String[] args) {
		F total=(a,b)->a*b;
		System.out.println(total.multiple(5,6));

	}

}
