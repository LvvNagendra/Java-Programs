package Practice;



public class PLetterPattern {
	public static void main(String[] args) {
//	int n=5;
//	int m=3;
//	for(int i=0;i<=n;i++) {
//		for(int j=0;j<=m;j++) {
//			if(j==3||j==0||i==5||i==
//					0) {
//				System.out.print("* ");
//			}else {
//			System.out.print("  ");
//		}
//			}
//		System.out.println();
//	}
		
		for(int i=0;i<=6;i++) {
			for(int j=0;j<=3;j++) {
				if(j==0||i==0||i==3||(j==3 &&i<3)) {
					System.out.print("* ");
				}
				else {
					System.out.print("  ");
				}
				
			}
			System.out.println("");
		}
	}
}
