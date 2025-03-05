package nani;

public class ReverseWord {

	public static void main(String[] args) {
		String s= "nagendra naidu";
		String []word=s.split(" ");
		String revereString="";
		for(int i=0;i<word.length;i++) {
			String words=word[i];
			String reverseWord="";
			for( int j=words.length()-1;j>=0;j--) {
				reverseWord=reverseWord+words.charAt(j);
			}
			
			revereString=revereString+reverseWord+" ";
		}
		System.out.println(revereString);

	}

}
