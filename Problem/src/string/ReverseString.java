package string;

public class ReverseString {

	public static void main(String[] args) {
		String s ="great learning";
		
//		for(int i=s.length()-1;i>=0;i--) {
//			System.out.print(s.charAt(i));
//		}

		String[] words = s.split(" ");
        
        String reverseString = "";
         
        for (int i = 0; i < words.length; i++) 
        {
            String word = words[i];
             
            String reverseWord = "";
             
            for (int j = word.length()-1; j >= 0; j--) 
            {
                reverseWord = reverseWord + word.charAt(j);
            }
             
            reverseString = reverseString + reverseWord + " ";
        }
         
        System.out.println(s);
         
        System.out.println(reverseString);
	}
		

}
