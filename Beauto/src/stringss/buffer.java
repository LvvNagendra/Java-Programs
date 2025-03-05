package stringss;

public class buffer {

	public static void main(String[] args) {
		StringBuffer s=new StringBuffer("nagendra");
		//StringBuffer x=s.append(",vikash");
		
		
		//System.out.println(x);
		System.out.println(s);
		System.out.println(s.insert(2,"i"));
		System.out.println(s.append(",nani"));
		System.out.println(s.deleteCharAt(2));
		System.out.println(s.reverse());
		System.out.println(s.charAt(1));
		System.out.println(s.delete(1, 3));
		System.out.println(s.replace(2, 3, "nagendra"));
	}
}