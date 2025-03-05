package stringss;

public class Bulde {

	public static void main(String[] args) {
		StringBuilder s=new StringBuilder(); 
		s.append("nani");
		System.out.println(s.capacity());
		s.append("nagendra");
		System.out.println(s.capacity());
		s.ensureCapacity(50);
		System.out.println(s.capacity());
		System.out.println(s.insert(0,"vikas"));
		System.out.println(s.reverse());
		System.out.println(s.replace(2,5,"sai"));
		System.out.println(s.delete(0, 2));
		System.out.println(s.substring(0,3));
		
		
	}

}
