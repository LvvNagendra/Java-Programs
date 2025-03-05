package collections;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Propertiess {

	public static void main(String[] args) throws IOException {
	
		FileReader reader=new FileReader("D:\\Nagendra\\.metadata");  
	      
	    Properties p=new Properties();  
	    p.load(reader);  
	      
	    System.out.println(p.getProperty("name"));  
	    System.out.println(p.getProperty("phone"));  

	}

}


