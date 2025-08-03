package vut;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 *
 * @author User
 */
public class ReadObjectDataExample {

    public static void main(String[] args) {

        try {
            FileInputStream fis = new FileInputStream("student.dat");
            ObjectInputStream oob = new ObjectInputStream(fis);
            Student obj = (Student) oob.readObject();

            System.out.println("Name: " + obj.getName() + '\n' + "Age: " + obj.getAge());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.getMessage();
        }
    }
}
