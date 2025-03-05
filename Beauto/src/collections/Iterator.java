package collections;
import java.util.ArrayList;
public class Iterator {
public static void main(String[] args) {
		ArrayList a=new ArrayList();
		int i;
		
		for (i=0;i<=10;i++) 
			a.add(i);
			System.out.println(" "+i);
		java.util.Iterator itr=  a.iterator();
	while(itr.hasNext()) {
		 i=(int) itr.next();
		 System.out.print(i+" ");
		 if(i%2!=0) 
			 itr.remove();
		 }
		 System.out.println();
	    System.out.println(a);
		}}
