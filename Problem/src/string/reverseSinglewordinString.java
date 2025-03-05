package string;



	public class reverseSinglewordinString {
	    public static void main(String[] args) {
	        String s = "nagendra naidu lankalapalli";
	        
	        // Split the string into words using space as the delimiter
	        String[] words = s.split(" ");
	        
	        // Initialize the variable to store the reversed string
	        String reverseStrings = "";
	        
	        for (int i = 0; i < words.length; i++) {
	        	String word=words[i];
	        	String rev ="";
	        	if(i==1) {
	        		for(int j=word.length()-1;j>0;j--) {
	        			rev=rev+word.charAt(j);
	        			
	        		}
	        		
	        	}
	        	else {
	        		rev=word;
	        	}
	        	
	        	reverseStrings=reverseStrings+" "+rev;
	        	
	        }
	        System.out.println(reverseStrings);
	    }
	}
