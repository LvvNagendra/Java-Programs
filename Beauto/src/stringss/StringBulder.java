package stringss;

public class StringBulder {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder("nagendra ");  
		s.append("prasanth");
		System.out.println(s);
		System.out.println(s.insert(0,"vikas"));
		System.out.println(s.reverse());
		System.out.println(s.replace(2,5,"sai"));
		System.out.println(s.delete(0, 2));
		System.out.println(s.substring(0,3));
		
	}

}
