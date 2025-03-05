package beaut;
class Kgf{
	String hero="hash";
	String vilan="nani";
}
class Kgf2 extends Kgf{
	String hero=" clone hash";
	
	void hero() {
		System.out.println(hero);
		System.out.println(this.hero);//current class object
		System.out.println(super.hero);//parent class object
	}
	
	
	
	
}
public class Movie {

	public static void main(String[] args) {
		Kgf2 fliem=new Kgf2();
		fliem.hero();
		
		

	}

}
