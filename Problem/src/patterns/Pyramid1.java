package patterns;

public class Pyramid1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		for (int i = 1; i <= n; i++) {

			for (int j = i; j < n; j++) {
				System.out.print(" ");
			}

			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < n - i; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}
//
	}

}
