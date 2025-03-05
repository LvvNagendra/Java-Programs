package Practice;

//package Practice;
//
//
//	public class Test {
//	public static void main(String[] args) 
//	{
//		
//		int arr[]= {5,4,3,2,1,7};
//		int max=arr[0];
//		int secondMax=arr[0];
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//			}
//		}
//		System.out.println("maximum value  array=" +max);
//		for(int i=0;i<arr.length;i++) {
//			if(arr[i]>max) {
//				max=arr[i];
//				if(arr[i]>secondMax && arr[i]<max) {
//					secondMax=max;
//					
//				}
//			}
//		}
//		System.out.println("second=" + secondMax);
//		
//		
//	}}

class A { 
	int x=100;
	 void m1() {
	       System.out.println("m1 in class A");	 
	 }
	}
class B extends A {
	int x=200;
	 void m1() {
	       System.out.println("m2 in class B");	 
	 }
	}
	public class Test {
	public static void main(String[] args) 
	{
	    B b = new B();
System.out.println(b.x);
	     b.m1(); 
	 
	    A a = new A();
	    System.out.println(a.x);
	     a.m1();
	 
	    A a2 = new B();
	    System.out.println(a2.x);
	     a2.m1();
	  }
	}
