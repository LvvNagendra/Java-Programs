package stringss;

public class Duplicateremove {

	public static void main(String[] args) {
		String str = "Abc pqr xyz Abc mnq pqr  pqr xyz mnq";
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

}
