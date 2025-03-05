 package strings;

public class commonwords {

	public static void main(String[] args) {
		  String a="nih";
		String b="naih";
				
		//int count=0;
		//char c[]=a.toCharArray();
		//char d[]=b.toCharArray();
		for(int i=0;i<=a.length()-1;i++) {
			for (int j=0;j<=b.length()-1;j++) {
				if(a.charAt(i)==b.charAt(j)) {
					System.out.println(a.charAt(i));
				}
			}
		}
			

	}

}
