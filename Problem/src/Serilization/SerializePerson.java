package Serilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializePerson {

    public static void main(String[] args) {

        Person john = new Person("John Doe", 30);

        try {

            FileOutputStream fileOut = new FileOutputStream("person.ser");

            ObjectOutputStream out = new ObjectOutputStream(fileOut);

            out.writeObject(john);

            out.close();

            fileOut.close();

            System.out.println("Serialized data is saved in person.ser");

        } catch (IOException i) {

            i.printStackTrace();

        }

    }

}
