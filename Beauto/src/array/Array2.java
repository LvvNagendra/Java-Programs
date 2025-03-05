package array;

public class Array2 {

	public static void main(String[] args) {
		/*int a[]= {4,5,6,5,0};
		int b[]= {2,5,6,5,0};
		int c[]= {3,5,6,5,0};
		int d[]= {5,5,6,5,0};*/
		int e[][]= {
				{4,5,6,5,0},
				{2,5,6,5,0},
				{3,5,6,5,0},
				{5,5,6,5,0},
		};
		for(int i=0;i<e.length;i++) {
			for(int j=0;j<e[i].length;j++) {
				System.out.print(" " +e[i][j]);
			}
			System.out.println();
		}

}
}