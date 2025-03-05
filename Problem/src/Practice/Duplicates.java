package Practice;

public class Duplicates {
	public static void main(String[] args) {
		int a[]= {1,2,3,5};
		int b[]= {1,2,3,4};
		for(int c:a) {
			for(int d:b) {
				if(c==d) {
					System.out.println(d);
				}
			}
		}
		
//		
//		for(int i=0;i<a.length;i++) {
//			for(int j=0;j<i;j++){
//				if(a[i]!=b[j]) {
//					System.out.println(j);
//				}
//			}
//		}
//		
		
	
		}

}
