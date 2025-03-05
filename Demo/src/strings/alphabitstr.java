package strings;

public class alphabitstr {

	public static void main(String[] args) {
		String s= "nagendra";
		char a[]=s.toCharArray();
		char temp;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int k=0;k<a.length;k++) {
			System.out.print(a[k]);
		}

	}

}
