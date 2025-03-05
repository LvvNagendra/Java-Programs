package array;
public class Array {
public static void main(String[] args) {
	int sum=0,n;
		int a[]= {3,4,6,7,2,9,12,18,19};
		n=a.length;
		for(int i=0;i<n;i++) {
			sum=sum+a[i];
			}
		System.out.println("sum of array element: ="+sum);
				int even=0,odd=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]%2==0) 
				even+=a[i];
				else
				odd+=a[i];
				System.out.println("print even number:"+a[i]);	
		}
		System.out.println("sum of even number : "+even);
		System.out.println("sum of odd numbers : "+odd);
		int min=a[0];
		int  max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				min=a[i];
				}
			if(a[i]>max) {
				max=a[i];
			}}
		System.out.println("min value:"+min);
		System.out.println("max value:"+max);
}}
