package Assignment4.Ex1;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class Design extends JFrame {

    //declarations
    private JTextField textsName, textAdd, textProvince, textCity, textPostal, textPhone, textEmail;
    private JTextArea textArea,textDisplay;
    private JCheckBox studentCouncil, volunteer;
    private JButton buttonDisplay;
    private JRadioButton computer, business;
    private JPanel pCenter, pDown,pMid;
    private JComboBox<String> courseSelection;
    private JList<String> selectedCourseList;
    private DefaultListModel<String> courseListHolder;
    private static final String[] csSubjects = {"Java", "Python", "C#", "Database"};
    private static final String[] businessSubjects = {"Accounts", "Maths", "Communication"};


    public Design() {

        JPanel pChoice = new JPanel();
        pChoice.setLayout(new FlowLayout());

        //basic grid with row wise element
        pCenter = new JPanel();
        pCenter.setLayout(new GridLayout(8, 4));

        pCenter.add(new JLabel("Name: "));
        pCenter.add(textsName = new JTextField(10));
        pCenter.add(new JLabel(""));

        //cs and bussiness as one component
        pChoice.add(computer = new JRadioButton("Computer Science"));
        pChoice.add(business = new JRadioButton("Business"));
        pCenter.add(pChoice);

        pCenter.add(new JLabel("Address: "));
        pCenter.add(textAdd = new JTextField(10));
        pCenter.add(studentCouncil = new JCheckBox("Student Council"));
        pCenter.add(courseSelection = new JComboBox<String>(csSubjects));
        selectedCourseList = new JList<String>();

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

        //display button in new panel
        pMid = new JPanel();
        pMid.add(buttonDisplay = new JButton("Display"));

        //display area
        pDown = new JPanel();
        pDown.add(textDisplay = new JTextArea(5,105));


        add(pCenter, BorderLayout.NORTH);
        add(pMid, BorderLayout.CENTER);
        add(pDown, BorderLayout.SOUTH);

        //some handling
        Events handler = new Events();
        computer.addActionListener(handler);
        business.addActionListener(handler);

        buttonDisplay.addActionListener(new ActionListener() {
            //text display
            @Override
            public void actionPerformed(ActionEvent e) {
                String detailsString="";
                if(!textsName.getText().isEmpty())
                {
                    detailsString+=textsName.getText()+", ";
                }
                if(!textAdd.getText().isEmpty())
                {
                    detailsString+=textAdd.getText()+"\n ";
                }
                if(!textCity.getText().isEmpty())
                {
                    detailsString+=textCity.getText()+", ";
                }
                if(!textProvince.getText().isEmpty())
                {
                    detailsString+=textProvince.getText()+", ";
                }
                if(!textPostal.getText().isEmpty())
                {
                    detailsString+=textPostal.getText()+", ";
                }
                if(!textPhone.getText().isEmpty())
                {
                    detailsString+=textPhone.getText()+", ";
                }
                if(!textEmail.getText().isEmpty())
                {
                    detailsString+=textEmail.getText();
                }

                detailsString+="\n";

                if(selectedCourseList.getModel().getSize()!=0)
                {
                    detailsString+="Courses :"+"\n";

                    for(int i=0;i<selectedCourseList.getModel().getSize();i++)
                    {
                        detailsString+=selectedCourseList.getModel().getElementAt(i)+"\n";
                    }
                }

                //radio button selection
                if(studentCouncil.isSelected())
                {
                    detailsString+="Student Council : Yes"+"\n";
                }else {
                    detailsString+="Student Council : No"+"\n";
                }

                if(volunteer.isSelected())
                {
                    detailsString+="Volunteer Work : Yes"+"\n";
                }else {
                    detailsString+="Volunteer Work : No"+"\n";
                }

                textDisplay.setText(detailsString);
            }
            });


    }



    private class Events implements ActionListener {

        //Combo Box selection
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand().toString().equals("Computer Science"))
            {
                courseSelection.removeAllItems();
                for(int count=0;count<csSubjects.length;count++)
                    courseSelection.addItem(csSubjects[count]);
            business.setSelected(false);

            }
            else
            {
                courseSelection.removeAllItems();
                for(int count=0;count<businessSubjects.length;count++)
                    courseSelection.addItem(businessSubjects[count]);
                computer.setSelected(false);
            }

        }

    }


    // main method
    public static void main(String[] args) {
        Design lmTest = new Design();
        lmTest.setSize(1070, 440);
        lmTest.setVisible(true);
    }


}


