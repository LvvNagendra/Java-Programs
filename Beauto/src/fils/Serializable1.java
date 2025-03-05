package fils;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serializable1 {

	public static void main(String[] args) {
		try {
		Collage c=new Collage(1,"KIET");
		FileOutputStream fo=new FileOutputStream("D:\\nani");
		ObjectOutputStream ob= new ObjectOutputStream(fo);
		ob.writeObject(c);
		ob.flush();
		ob.close();
		System.out.println("write data in the file,");
		
		
		

	}catch 
		(Exception e)
		{
			e.getMessage();
		}

}}
