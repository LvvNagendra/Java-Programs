package Practice;

public class StringPalindrom {
	public static void main(String[] Args) {
		String s = "nan";
//	String s1=new StringBuffer(s).reverse().toString();
//	if(s.equalsIgnoreCase(s1) ) {
//		System.out.println("palidrome");
//	}
//	else {
//		System.out.println("not");
//	}

		String rev = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		if (s.equals(rev)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a palindrome");
		}
	}

}
