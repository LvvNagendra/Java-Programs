package fils;

import java .io.*;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

 public class SerilizationTesting {

	public static void main(String[] args) throws IOException   {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("file address");
		} catch (FileNotFoundException e1) {
			
			e1.printStackTrace();
		}
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Everyday e=new Everyday();
		oos.writeObject(e);
	}


	

}
