package demo;
interface A1 {
	public void add(int a,int b);
}
/*abstract class B3 implements A1{
	public void add(int a,int b) {
		System.out.println((a+b));
	}}*/
public final class Lamda {

	public static void main(String[] args) {
		A1 i=(int a,int b)->System.out.println((a+b));
		i.add(10,20);
		

	}

}
