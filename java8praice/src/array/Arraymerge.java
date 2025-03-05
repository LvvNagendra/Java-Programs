package array;


public class Arraymerge {
	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4,8 };
		int[] b = { 5, 10, 7, 8 };
		int[] mergeArray = new int[a.length + b.length];
		for (int i = 0; i < a.length; i++) {
			mergeArray[i] = a[i];
		}
		for (int i = 0; i < b.length; i++) {
			mergeArray[a.length + i] = b[i];

		}
		for (int i : mergeArray) {
			System.out.print(" "+i);
		}
	}
}
