package strings;

public class OVEWLS {

	public static void main(String[] args) {
		int vCount=0,cCount=0;
		String s="nagendra";
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u') {
				vCount++;
			}
			else {
				if(s.charAt(i)>='a') //&& s.charAt(i)<='z')
					cCount++;
			}
		}
		System.out.println("ovewls:"+vCount);
		System.out.println("constants:"+cCount);
				

	}

}
