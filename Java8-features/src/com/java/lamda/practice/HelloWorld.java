package com.java.lamda.practice;

class HelloWorld {
    public static void main(String[] args) {        
        test();
    }
static String test() {
        try
        {
        int data=50/0;
        System.out.println("Inside Try");
        }
        catch(ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Inside Catch");
           // return ex;
        }
        finally {
            return "Hello World";
         //  System.out.println("Inside Finally");
        }
    }
}