package beaut;


interface Company
{
	int cid= 1;
	String cname= "nani";
	String ccompany= "beauto";
	void CompanyDisplay() ;	
	}
interface Employee extends Company{
		int eid=2;
		String ename="sai";
		String ecompany= "beauto";
		void Employee();
		}
	 class Details implements Employee{
		
		public void CompanyDisplay() {
			System.out.println("cid= "+cid+  "cname="+cname+"ccompany"+ccompany);
		}
	
	 
	 void EmployeeDisplay() {
		 System.out.println("eid= "+eid+"ename"+ ename+"ecompany="+ecompany);
	 }

	@Override
	public void Employee() {
		// TODO Auto-generated method stub
		
	}
	
	}

public class Show {

	public static void main(String[] args) {
		Details d=new Details();
		
		
		d.CompanyDisplay();
		d.EmployeeDisplay();
		

	}

}
