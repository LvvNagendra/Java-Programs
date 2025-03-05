
public class taranary3 {

	public static void main(String[] args) {
		int n1=30;int n2=600,n3=5000,max,min;
		System.out.println("first num:" +n1);
		System.out.println("second num:" +n2);
		System.out.println("third num:" +n3);
		max=(n1>n2)?n1:(n2>n3)?n2:n3;
		min=(n1<n2)?n1:(n2<n3)?n2:n3;
		System.out.println("Maximum is= "+ max);
		System.out.println("Minimum is= "+ min);
		
	}

}
