package Assement1;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class PrintDuplicates {
	
	public static void main(String[] args)  {
	
		String s = "Beauto System Employees";
		String str = "";
		for (int i = 0; i <= s.length()-1; i++) {
		if (str.contains("" + s.charAt(i))) { 
		
		   continue;
		}
		str += s.charAt(i);
		}
		System.out.println(str);
		
	}
	}
	
	

	

   /* static String removeDuplicate(char str[], int n)
    {
        
        int index = 0;
 
       
        for (int i = 0; i < n; i++)
        {
 
           
            int j;
            for (j = 0; j < i; j++)
            {
                if (str[i] == str[j])
                {
                    break;
                }
            }
 
           
            if (j == i)
            {
                str[index++] = str[i];
            }
        }
        return String.valueOf(Arrays.copyOf(str, index));
    }
	
	public static void main(String[] args)  {
        char str[] = "Beauto System Employees".toCharArray();
        int n = str.length;
        System.out.println(removeDuplicate(str, n));
    }
}*/
		
		
/*public static void main(String[] args) {
		
		String str = " Beauto System Employees ";
		
		
		 String words[]=str.split(" ");
		 for (int i=0;i<=words.length;i++) {
			 int count=1;
		 for(int j=i+1;j<words.length;j++) {
				 if(words[i].equals(words[j])) {
					 count++;
					 words[j]="0";
				 }
			 }
			 if(count>1&&words[i]!="0"){
				 System.out.println(words[i]);
			 }
		 }

}
}*/
