
package vut;

import java.io.*;

/**
 *
 * @author jane
 */
public class WriteFileExample {

    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("example.txt");
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write("This is my first line");
            writer.newLine();
            writer.write("This is my second line");
            writer.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
}
