package Assignment2.Ex2;

import javax.swing.*;
import java.util.*;
import java.util.Scanner;

public class LottoTest {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        JOptionPane.showMessageDialog(null,"Welcome To Lotto");
        for(int i=0;i<4;i++) {
            String c = JOptionPane.showInputDialog(null, "Enter Your choice- ");
            int choice = Integer.parseInt(c);

            //Entered value should not exceed 27 and not less than 3
            if (choice < 3 || choice > 27) {
                JOptionPane.showMessageDialog(null, "OOps.... Wrong Entry !!!%n" +
                        "Number should be from 3 to 27");
                i=1;
            }
            else {i=5;}
        }
    }
}
