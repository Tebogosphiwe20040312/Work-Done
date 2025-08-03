package vut;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author jane
 */
public class WriteDatExample {

    public static void main(String[] args) {

        String data = "My name is Tebogo";
        try {
            FileOutputStream fos = new FileOutputStream("example.dat");
            fos.write(data.getBytes());
            System.out.println("Data written to example.dat");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
