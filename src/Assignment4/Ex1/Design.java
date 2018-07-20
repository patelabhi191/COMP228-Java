package Assignment4.Ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Design extends JFrame implements ActionListener {

    private JTextField textsName, textAdd, textProvince, textCity, textPostal, textPhone, textEmail;
    private JTextArea textArea,textDisplay;
    private JCheckBox studentCouncil, volunteer;
    private JButton buttonDisplay;
    private JRadioButton computer, business;
    private JPanel pCenter, pDown,pMid;
    private final JComboBox<String> subjects;
    private static final String[] csSubjects = {"Java", "Python", "C#", "Database"};
    private static final String[] businessSubjects = {"Accounts", "Maths", "Communication"};


    public Design() {

        JPanel pChoice = new JPanel();
        pChoice.setLayout(new FlowLayout());

        pCenter = new JPanel();
        pCenter.setLayout(new GridLayout(8, 4));

        pCenter.add(new JLabel("Name: "));
        pCenter.add(textsName = new JTextField(10));
        pCenter.add(new JLabel(""));

        pChoice.add(computer = new JRadioButton("Computer Science",true));
        pChoice.add(business = new JRadioButton("Business",false));
        pCenter.add(pChoice);

        pCenter.add(new JLabel("Address: "));
        pCenter.add(textAdd = new JTextField(10));
        pCenter.add(studentCouncil = new JCheckBox("Student Council"));
        pCenter.add(subjects = new JComboBox<String>(csSubjects));

        pCenter.add(new JLabel("Province: "));
        pCenter.add(textProvince = new JTextField(10));
        pCenter.add(new JLabel(""));
        pCenter.add(new JLabel(""));

        pCenter.add(new JLabel("City: "));
        pCenter.add(textCity = new JTextField(10));
        pCenter.add(new JLabel(""));
        pCenter.add(textArea = new JTextArea(2,15));

        pCenter.add(new JLabel("Postal Code: "));
        pCenter.add(textPostal = new JTextField(10));
        pCenter.add(new JLabel(""));
        pCenter.add(new JLabel(""));

        pCenter.add(new JLabel("Phone: "));
        pCenter.add(textPhone = new JTextField(10));
        pCenter.add(new JLabel(""));
        pCenter.add(new JLabel(""));

        pCenter.add(new JLabel("Province: "));
        pCenter.add(textProvince = new JTextField(10));
        pCenter.add(volunteer = new JCheckBox("Volunteer Work"));
        pCenter.add(new JLabel(""));

        pCenter.add(new JLabel("Email: "));
        pCenter.add(textEmail = new JTextField(10));
        pCenter.add(new JLabel(""));
        pCenter.add(new JLabel(""));

        pMid = new JPanel();
        pMid.add(buttonDisplay = new JButton("Display"));



        pDown = new JPanel();
        pDown.add(textDisplay = new JTextArea(5,105));


        add(pCenter, BorderLayout.NORTH);
        add(pMid, BorderLayout.CENTER);
        add(pDown, BorderLayout.SOUTH);

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }


    // main method
    public static void main(String[] args) {
        Design lmTest = new Design();
        lmTest.setSize(880, 440);
        lmTest.setVisible(true);
    }
}

