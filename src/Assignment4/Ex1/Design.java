package Assignment4.Ex1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Design extends JFrame implements ActionListener {

    private JTextField[] texts;
    private JLabel[] labels;
    private JPanel pCenter;
    /*private final JTextField textAddress;
    private final JTextField textProvince;
    private final JTextField textCity;
    private final JTextField textPostalCode;
    private final JTextField textPhone;
    private final JTextField textEmail;
*/

    public Design() {
        setLayout(new BorderLayout());
        pCenter = new JPanel();


        pCenter.setLayout(new GridLayout(4, 7, 1, 1));
        labels[0] = new JLabel("Name: ");
        labels[1] = new JLabel("Address: ");
        labels[2] = new JLabel("Province: ");
        labels[3] = new JLabel("City: ");
        labels[4] = new JLabel("Postal Code: ");
        labels[5] = new JLabel("Phone: ");
        labels[6] = new JLabel("Email: ");

        for (int count = 0; count < 7; count++) {
            pCenter.add(labels[count]);
        }
        for (int count = 0; count < 7; count++) {
            texts[count] = new JTextField(15);
            texts[count].addActionListener(this);
            pCenter.add(texts[count]);
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }


    // main method
    public static void main(String[] args) {
        Design lmTest = new Design();
        lmTest.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lmTest.setSize(500, 300);
        lmTest.setVisible(true);
    }
}

