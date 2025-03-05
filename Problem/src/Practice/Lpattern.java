package Practice;

public class Lpattern {

	public static void main(String[] args) {
	for(int i=0;i<=7;i++) {
		for(int j=0;j<=5;j++) {
			if(i==7||i==0||j==5) {
				System.out.print("* ");
			}
		}
		System.out.println();
	}
	
	}
}
