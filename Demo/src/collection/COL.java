package collection;

import java.util.*;

public class COL {

	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		//Set a=new HashSet<>();
		//Set a=new LinkedHashSet<>();
		//Set a= new TreeSet<>();
		a.add("Bri");
			a.add(1);
			a.add("Cri");
			a.add("Dpu");
			a.add("Anag");
			Iterator it =a.iterator();
while(it.hasNext())
{
			System.out.println(it.next());	
			//System.out.println(a.remove(a));
		}
	}
		
}
	
