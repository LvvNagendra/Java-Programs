package stringss;

public class Charrr {

	public static void main(String[] args) {
		String s="nagendra";//string literal
		String a=new String ("nani");//new keyword
				;
		
		System.out.println(s.charAt(1));
		System.err.println(s.length());
		System.out.println(s.replace("a", "b"));
		System.out.println(s.indexOf("e"));
		System.out.println(s.concat(a));
		System.out.println(a.trim());
		System.out.println(s.contains("a"));
		System.out.println(s.hashCode());
		System.out.println(s.split(s, 5));
		System.out.println(s.compareTo(a));
		System.out.println(s.replaceAll("a","b"));
		System.out.println(s.toUpperCase());
		if(s==a) {
			System.out.println("eqal");
		}
		else {
			System.out.println("not eqal");
		}
		

	}
}
