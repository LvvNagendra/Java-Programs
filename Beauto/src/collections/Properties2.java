package collections;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class Properties2 {

	public static void main(String[] args) throws IOException {
		Properties p = new Properties();
		p.setProperty("name", "NANI");
		p.setProperty("phone", "8897590280");

		p.store(new FileWriter("D:\\Nagendra\\.metadata"), "");

	}

}


