
package vut;

/**
 *
 * @author jane
 */
import java.io.*;
import java.io.IOException;

public class FileExample {

    public static void main(String[] args) {
        File file = new File("example.txt");
        try { 
            if (file.createNewFile()) {
                System.out.println("File Created: " + file.getName());
            } else {
                System.out.println("File already exists.");
                System.out.println("File location: " + file.getAbsolutePath());
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        }
    }

}
