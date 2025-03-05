package Constructors;

public class Cube {
    private int length;


    public Cube() {
        this.length = 10; 
    }


    public Cube(int length) {
        this.length = length;
    }

    public double calculateVolume() {
        return Math.pow(length, 3);
    }

    public static void main(String[] args) {
      
        Cube cubeDefault = new Cube();
        System.out.println("Constructor without parameter");
        System.out.println("Volume is " + cubeDefault.calculateVolume());

     
        Cube cubeParam = new Cube(3); 
        System.out.println("Constructor with parameter");
        System.out.println("Volume is " + cubeParam.calculateVolume());
    }
}

