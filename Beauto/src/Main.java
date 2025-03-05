public interface 


{
   default void show() {
      System.out.println("In Java 8- default method - DefaultStaticExampleInterface");
   }
   static void display() {
      System.out.println("In DefaultStaticExampleInterface I");
   }
}
public class DefaultStaticExampleClass implements DefaultStaticExampleInterface {
}
public class Main {
   static void main(String args[]) {
      // Call interface static method on Interface
      DefaultStaticExampleInterface.display();
      DefaultStaticExampleClass defaultStaticExampleClass = new DefaultStaticExampleClass();
     
      // Call default method on Class
      defaultStaticExampleClass.show();
   }
}