package threads;

class MyClass {
    

    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();
        C objC = new C();
        D objD = new D();

        A.a = 10;
        A.a = 90;

        objD.printA(); // Print A.a from class D
        objC.setAValue();
        objB.setAValue();
        //objA.a;
    }
}

class A {
	 static int a = 30;
}

class B {
    public void setAValue() {
        A.a = 10;
        System.out.println(A.a);
    }
}

class C {
    public void setAValue() {
        A.a = 90;
    }
}

class D {
    public void printA() {
        System.out.println(A.a);
    }
}
