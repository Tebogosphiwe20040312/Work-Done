package vut.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.*;
import vut.data.StudentClass;

/**
 *
 * @author 222467088 TS Jiyane
 */
public class StudInfoScreen extends JFrame {

    //Labels
    JLabel lblsno = new JLabel("Stud No:");
    JLabel lblnm = new JLabel("Stud Name:");
    JLabel lblgender = new JLabel("Gender:");
    JLabel lblscode = new JLabel("SubjCode:");
    JLabel lblmarks = new JLabel("Marks:");

//Inputs
    JTextField txtsno = new JTextField();
    JTextField txtnm = new JTextField();
    JTextField txtmarks = new JTextField();

    JRadioButton rbFem = new JRadioButton("Female");
    JRadioButton rbMale = new JRadioButton("Male");

    JComboBox<String> cmb = new JComboBox<>();

    JButton btnAdd = new JButton("Add Stud");
    JButton btnClear = new JButton("Clear");
    JButton btnClose = new JButton("Close");

    //declare arrayList
    private ArrayList<StudentClass> arStud;

    public StudInfoScreen(ArrayList<StudentClass> arStud) {
        this.arStud = arStud;
//Add items to the Combo Boxes
        cmb.addItem("ASDSY3A");
        cmb.addItem("ASDSY1A");
        cmb.addItem("AIWMX2A");
        cmb.addItem("AIBAX3A");

        //declare Panel
        JPanel pnl = new JPanel();
        pnl.setLayout(null);

        //Add Components to the Panel
        //Add lables
        pnl.add(lblsno);
        pnl.add(lblnm);
        pnl.add(lblgender);
        pnl.add(lblscode);
        pnl.add(lblmarks);

        //Add text fields
        pnl.add(txtsno);
        pnl.add(txtnm);
        pnl.add(txtmarks);

        //Add Radio Buttons
        pnl.add(rbFem);
        pnl.add(rbMale);

        //Add combo box
        pnl.add(cmb);

        //Add buttons
        pnl.add(btnAdd);
        pnl.add(btnClose);
        pnl.add(btnClear);

        //SetBounts
        lblsno.setBounds(10, 20, 140, 20);
        lblnm.setBounds(10, 50, 140, 20);
        lblgender.setBounds(10, 80, 140, 20);
        lblscode.setBounds(10, 110, 140, 20);
        lblmarks.setBounds(10, 140, 140, 20);

        txtsno.setBounds(100, 20, 120, 20);
        txtnm.setBounds(100, 50, 120, 20);
        rbFem.setBounds(100, 80, 100, 20);
        rbMale.setBounds(210, 80, 100, 20);
        cmb.setBounds(100, 110, 120, 20);
        txtmarks.setBounds(100, 140, 120, 20);

        //buttons
        btnAdd.setBounds(10, 180, 100, 20);
        btnClear.setBounds(140, 180, 100, 20);
        btnClose.setBounds(270, 180, 100, 20);

        //set Contentpane to make objects show
        setContentPane(pnl);

        //register button events
        btnAdd.addActionListener(new btnAddEvent());
        btnClear.addActionListener(new btnClearEvent());
        btnClose.addActionListener(new btnCloseEvent());

    }

    private class btnAddEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            //call method with all input
            StudentClass objClass = getStudInfo();

            arStud.add(objClass);
        }

    }

    private class btnClearEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            txtsno.setText("");
            txtsno.requestFocus();
            txtnm.setText("");
            txtmarks.setText("");
            rbFem.setSelected(false);
            rbMale.setSelected(false);
            cmb.setSelectedIndex(0);

        }

    }

    private class btnCloseEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            dispose();
        }

    }

    //method to get all inputs
    public StudentClass getStudInfo() {
        String stnum, stname, gender, subcode;
        int marks;
        stnum = txtsno.getText();
        stname = txtnm.getText();
        subcode = cmb.getSelectedItem().toString();
        marks = Integer.parseInt(txtmarks.getText());

        if (rbFem.isSelected()) {
            gender = rbFem.getText();
        } else {
            gender = rbMale.getText();
        }
        StudentClass objStud = new StudentClass(stnum, stname, gender, subcode, marks);
        return objStud;
    }
}
