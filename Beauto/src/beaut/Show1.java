package beaut;

interface Companyee
{
	int cid= 1;
	String cname= "nany";
	String ccompany= "beauto";
	void Company1Display() ;	
	}
interface Company2{
		int eid=2;
		String ename="sai";
		String ecompany= "beauto";
		void Company2Display();
}
	  public class Show1 implements Companyee,Company2{
		
		public void CompanyDisplay() {
			System.out.println("cid= "+cid+  "cname="+cname+"ccompany"+ccompany);
		}
	
	 
	 void EmployeeDisplay() {
		 System.out.println("eid= "+eid+"ename"+ ename+"ecompany="+ecompany);
	 }

	 


	public static void main(String[] args) {
		Show1 d=new Show1();
		
		d.CompanyDisplay();
		d.EmployeeDisplay();
		

	
	}


	@Override
	public void Company2Display() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void Company1Display() {
		// TODO Auto-generated method stub
		
	}
}

