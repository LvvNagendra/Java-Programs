package mainclass;

import mainclass.phone.Iphone;
import mainclass.phone.OnePlus;
import mainclass.phone.Phone;

public class Hello {

	public static void main(String[] args) {
		Phone phone= new OnePlus();
		System.out.println(phone);
		Phone phone1= new Iphone();
		System.out.println(phone1);
		System.out.println(phone1.os());
		

	}

}
