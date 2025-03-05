package nagendra;



class Tree{
	String treename="mango tree";
	String colour="green";
	}
class TreesType extends Tree{
	
	
	
	TreesType(){
		String treename="apple tree";
		String colour="red";
		System.out.println(super.colour);
		System.out.println(super.treename);
		System.out.println(this.colour);
		System.out.println(this.treename);
		
	}

}

public class Supers  extends TreesType{

	public static void main(String[] args) {
		TreesType ts=new TreesType();
		
		
		System.out.println("nani");
		
		}
		

	}


