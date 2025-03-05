package Serilization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializePerson {

    public static void main(String[] args) {

        Person john = null;

        try {

            FileInputStream fileIn = new FileInputStream("person.ser");

            ObjectInputStream in = new ObjectInputStream(fileIn);

            john = (Person) in.readObject();

            in.close();

            fileIn.close();

        } catch (IOException i) {

            i.printStackTrace();

            return;

        } catch (ClassNotFoundException c) {

            System.out.println("Person class not found");

            c.printStackTrace();

            return;

        }

        System.out.println("Deserialized Person...");

        System.out.println(john);

    }
}
