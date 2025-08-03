package vut.gui;

import java.util.ArrayList;
import javax.swing.*;
import vut.data.StudentClass;

/**
 *
 * @author 222467088 TS Jiyane
 */
public class DisplayScreen extends JFrame {

    JTextArea taDisp = new JTextArea();

    public DisplayScreen(ArrayList<StudentClass> arStud) {
        taDisp.setEditable(false);
        JPanel pnl = new JPanel();
        pnl.add(taDisp);
        taDisp.setBounds(0, 0, 400, 300);
        setContentPane(pnl);

        displayAllStuds(arStud);
    }

    public void displayAllStuds(ArrayList<StudentClass> arStud) {

        taDisp.append("StudNo\t" + "Name\t" + "Gender\t" + "SCode\t" + "Marks\n");

        //display all records from the array list
        for (int i = 0;i<arStud.size();i++){
            taDisp.append(arStud.get(i).toString());
        }
    }

}
