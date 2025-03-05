package array;

public class Array3 {

	public static void main(String[] args) {
		int a[]= {5,6,7,8,3,4};
		for(int i=0;i<a.length;i++) {
			System.out.println("by using for loop:  "+a[i]);
		}
		for(int y:a) {
			System.out.println("for each loop:="+ y);
		}

	}

}
