package Practice;

 class AB{
	 private static  AB ab;
	 private AB() {
		 
	 }
	 public static AB getInstance() {
		 if(ab==null) {
			 ab= new AB();
		 }
		return ab;
		 
	 }
	 public void getConnection() {
	       System.out.println("You are now connected to the database.");
	      
	   }
	
}
public class SingleTone {

	public static void main(String[] args) {
		AB ab1=  AB.getInstance();
		ab1.getConnection();

	}

}
