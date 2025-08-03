
package vut;

import java.io.*;

/**
 *
 * @author jane
 */
public class ReadFileExample {

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader("example.txt");
            BufferedReader reader = new BufferedReader(fr);
            String Line;
            while ((Line = reader.readLine()) != null) {
                System.out.println(Line);
            }
        } catch (IOException e) {
            e.printStackTrace();
            
        }

    }
}
