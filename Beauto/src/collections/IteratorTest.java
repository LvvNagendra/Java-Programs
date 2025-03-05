package collections;

import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class IteratorTest {
	   public static void main(String[] args) {  
		   ArrayList listObject = new ArrayList<String>();
	      listObject.add("India");
	      listObject.add("Australia");
	      listObject.add("England");
	      listObject.add("Bangladesh");
	      listObject.add("South Africa");
	      Iterator it = (Iterator) listObject.iterator();
	      while (((java.util.Iterator) it).hasNext()) {
	         System.out.println(((java.util.Iterator) it).next());
	      }
	   }
	}

	


