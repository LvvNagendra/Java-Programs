package nani;
 interface I1 {
	public default String test() {
		return"nagendras";
	}
	
}
 interface I2{
	 public default String test() {
			return"nagendra";
		}
 }
public class MutipleInhertance implements I1,I2 {

	public static void main(String[] args) {
		MutipleInhertance obj = new MutipleInhertance();
        String result = obj.test(); // Call the default method from I1
        System.out.println(result);
		
	}

	@Override
	public String test() {
		
		return I2.super.test();
	}

}
