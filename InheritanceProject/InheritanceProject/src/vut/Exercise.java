package vut;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jane
 */
public class Exercise {

    public static void main(String[] args) {

        ITList obj = new ITList();

        obj.inputNames();
        obj.movement();
        //display the array
        obj.display1();

        //display the array list
        obj.display2();

    }
}

class StudentList {

    String name[] = new String[5];

    void inputNames() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 names: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter  names: ");
            name[i] = input.next();
        }
    }
}

class ITList extends StudentList {

    ArrayList<String> nameList = new ArrayList();

    void movement() {

        for (int i = 0; i < 5; i++) {

            nameList.add(name[i]);
        }
    }

    void display1() {
        // display names i n the array

        for (int i = 0; i < 5; i++) {
            System.out.println(name[i]);
        }
    }

    void display2() {
        // display the array list
        for (int i = 0; i < 5; i++) {
            System.out.println((i + 1) + " " + nameList.get(i));
        }
    }

}
