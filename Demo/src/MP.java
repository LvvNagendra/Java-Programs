import java.util.*;
public class MP {

	public static void main(String[] args) {
	HashMap<Integer,String>  m=new HashMap();
	m.put(1,"nag");
	m.put(3,"kir");
	m.put(2,"uppu");
	Set s=m.entrySet();
	Iterator i=s.iterator();
	while(i.hasNext()) {
		Map.Entry e=(Map.Entry)i.next();
	//for(Map.Entry e:m.entrySet()) {
		
		System.out.println(e.getKey()+" "+e.getValue());
		
	}

	}

}
