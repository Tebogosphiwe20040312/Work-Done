package vut.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;
import vut.data.StudentClass;

/**
 *
 * @author 222467088 TS Jiyane
 */
public class MainMenuScreen extends JFrame {

    //Declaring all menu items
    JMenuItem miaddStud, midisplay, misearch, micount, mihighest, miexit;

    //Declaring menus
    JMenu mnFile, mnStud;

    //Declare ArrayList
    private ArrayList<StudentClass> arStud;

    public MainMenuScreen() {
        //Create arraylist obj
        arStud = new ArrayList<>();

        //Create menu items objects
        miaddStud = new JMenuItem("Add New Stud");
        midisplay = new JMenuItem("Display All Stud Records");
        misearch = new JMenuItem("Search by Stud No");
        micount = new JMenuItem("Count Studs doing ASDSY3A Subj");
        mihighest = new JMenuItem("Get Stud with Highest Mark");
        miexit = new JMenuItem("Exit Application");

        //create menu items and add objects to menu items
        mnFile = new JMenu("File");

        //add items of this menu, according to order of appearance
        mnFile.add(misearch);
        mnFile.add(mihighest);
        mnFile.add(micount);
        mnFile.add(miexit);

        mnStud = new JMenu("Student");

        //add items of this menu according to order of appearance
        mnStud.add(miaddStud);
        mnStud.add(midisplay);

        //create menubar objects and add menus to menubar objects
        JMenuBar jmb = new JMenuBar();

        //add menus to the menu bar accoriding to order of appearance
        jmb.add(mnFile);
        jmb.add(mnStud);

        //Call setMenuBar method, padding menubar objects to make all menu items appear
        setJMenuBar(jmb);

        //Register all menuitems events
        miaddStud.addActionListener(new miAddStudEvent());
        midisplay.addActionListener(new miDisplayEvent());
        micount.addActionListener(new miCountEvent());
        mihighest.addActionListener(new miHighestEvent());
        miexit.addActionListener(new miExitEvent());
    }

    //Create menuitems events using inner class for each menu item
    private class miAddStudEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            //Calling Student Screen to open
            StudInfoScreen frm = new StudInfoScreen(arStud);
            frm.setVisible(true);
            frm.setTitle("STUDENT SCREEN BY TEBOGO");
            frm.setSize(400, 300);
            frm.setResizable(true);
        }

    }

    private class miDisplayEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            //Calling display screen to open
            DisplayScreen frm = new DisplayScreen(arStud);
            frm.setVisible(true);
            frm.setTitle("DISPLAY SCREEN BY TEBOGO");
            frm.setSize(400, 300);
            frm.setResizable(false);
        }

    }

    private class miCountEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

        }

    }

    private class miHighestEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (arStud.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No student records available!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            StudentClass highestStudent = null;
            int highestMark = Integer.MIN_VALUE;

            for (StudentClass student : arStud) {
                if (student.getMarks() > highestMark) {
                    highestMark = student.getMarks();
                    highestStudent = student;
                }
            }

            if (highestStudent != null) {
                JOptionPane.showMessageDialog(null,
                        "Student with Highest Mark:\n"
                        + "Student No: " + highestStudent.getStdno() + "\n"
                        + "Name: " + highestStudent.getStuname() + "\n"
                        + "Mark: " + highestStudent.getMarks(),
                        "Highest Mark", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    private class miExitEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int resp;
            resp = JOptionPane.showConfirmDialog(null, "Do you want to exit?", "Confirm", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                System.exit(0);
            } else {
                mnStud.requestFocus();
            }
        }

    }

    public static void main(String[] args) {

        MainMenuScreen frm = new MainMenuScreen();
        frm.setVisible(true);
        frm.setTitle("MAIN MENU SCREEN BY TEBOGO");
        frm.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
