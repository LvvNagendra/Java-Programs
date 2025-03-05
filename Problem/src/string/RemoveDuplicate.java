package string;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicate {
public static void main(String []args) {
	String s= "nagendra";
	Set <Character> set= new HashSet<Character>();
	StringBuffer bf= new StringBuffer();
	for(int i=0;i<s.length();i++) {
		char c=s.charAt(i);
		if(!set.contains(c)) {
			set.add(c);
			bf.append(c);
		}
		
	}
	System.out.println(bf);
	//System.out.println(removeDuplicate(s));
}
//public static String removeDuplicate(String s) {
//	Set <Character> set= new HashSet<Character>();
//	StringBuffer bf= new StringBuffer();
//	for(int i=0;i<s.length();i++) {
//		char c=s.charAt(i);
//		if(!set.contains(c)) {
//			set.add(c);
//			bf.append(c);
//		}
//		
//	}
//	return bf.toString();
//	
//}
}
