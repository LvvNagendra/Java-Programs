package stringss;

import java.util.ArrayList;
import java.util.StringJoiner;

public class Stringjoiner {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<>();
		 
        
        al.add("nani");
        al.add("lilly");
        al.add("saii");
        al.add("pavan");
StringJoiner sj = new StringJoiner(",");
 
        
        sj.setEmptyValue("sj is empty");
        System.out.println(sj);
 
        
        sj.add(al.get(0)).add(al.get(2));
        System.out.println(sj);
 
        
        System.out.println("Length of sj : "
                           + sj.length());
 
        StringJoiner sj2 = new StringJoiner(":");
        sj2.add(al.get(2)).add(al.get(3));
 
        
        sj.merge(sj2);
 
        
        System.out.println(sj.toString());
 
        System.out.println("Length of new sj1 : "
                           + sj.length());
    }

	}


