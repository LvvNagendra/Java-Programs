package string;

public class ReverseWords {

	public static void main(String[] args) {
		String s="I am good at Java";
		String[] str=s.split(" ");
		
		for(int i=str.length-1;i>=0;i--) {
			
			String word = str[i]+ " ";
			System.out.print(word);
			
		}
		

	}

}
