package Assignment4.Ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Design extends JFrame implements ActionListener {

    private JTextField textsName, textAdd, textProvince, textCity, textPostal, textPhone, textEmail;
    private JLabel labelEmpty;
    private JCheckBox studentCouncil, volunteer;
    private JPanel pCenter, pDown,p;


    public Design() {
        p = new JPanel();
        pCenter = new JPanel();
        pDown = new JPanel();


        pCenter.setLayout(new GridLayout(8, 3));

        pCenter.add(new JLabel("Name: "));
        pCenter.add(textsName = new JTextField(10));
        pCenter.add(new JLabel(""));

        pCenter.add(new JLabel("Address: "));
        pCenter.add(textAdd = new JTextField(10));
        pCenter.add(studentCouncil = new JCheckBox("Student Council"));

        pCenter.add(new JLabel("Province: "));
        pCenter.add(textProvince = new JTextField(10));
        pCenter.add(new JLabel(""));

        pCenter.add(new JLabel("City: "));
        pCenter.add(textCity = new JTextField(10));
        pCenter.add(new JLabel(""));

        pCenter.add(new JLabel("Postal Code: "));
        pCenter.add(textPostal = new JTextField(10));
        pCenter.add(new JLabel(""));

        pCenter.add(new JLabel("Phone: "));
        pCenter.add(textPhone = new JTextField(10));
        pCenter.add(new JLabel(""));

        pCenter.add(new JLabel("Province: "));
        pCenter.add(textProvince = new JTextField(10));
        pCenter.add(volunteer = new JCheckBox("Volunteer Work"));

        pCenter.add(new JLabel("Email: "));
        pCenter.add(textEmail = new JTextField(10));
        pCenter.add(new JLabel(""));







        add(pCenter, BorderLayout.CENTER);
      //  add(pDown, BorderLayout.SOUTH);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }


    // main method
    public static void main(String[] args) {
        Design lmTest = new Design();
        lmTest.setSize(500, 300);
        lmTest.setVisible(true);
    }
}

