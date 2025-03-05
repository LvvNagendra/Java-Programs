package beaut;

public class Sumeven {

	public static void main(String[] args) {
		int a[]= {9,8,6,3,1};
		int sum=0;
		int evensum=0;
		for( int i=0;i<a.length;i++){
			sum=sum+a[i];
			if(a[i]%2==0) {
				evensum=evensum+a[i];
		
			}
		}
		System.out.println("even sum:"+evensum);
		System.out.println("odd sum:"+(sum-evensum));
		


	}

}
