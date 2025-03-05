package collect;
import java.util.*;
public class Lst {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(1);
		al.add("nani");
		al.add("a");
		al.add(.23);
		al.add(.23);
		for(int i=0;i<=al.size();i++);{
			System.out.println(al);
		ArrayList bl=new ArrayList();
		bl.add("nani");
		
		al.retainAll(bl);
		/*System.out.println(al);
		ListIterator itr=al.listIterator();
		while(itr.hasNext()) {
			System.out.print(" ,"+itr.next());
		}
		while(itr.hasPrevious()) {
			System.out.println("  "+itr.previous());
			
		}
		System.out.println(al.remove(1));
		System.out.println(al);*/
		
		
		System.out.println(al);
		//System.out.println(al.addAll(2, al));
		//System.out.println(al);
		//System.out.println(al.get(0));
		//System.out.println(al.remove(3));
		//System.out.println(al);
		System.out.println(al.removeAll(al));
		System.out.println(al);
		
	}

	
	}}


