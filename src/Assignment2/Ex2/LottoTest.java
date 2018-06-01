package Assignment2.Ex2;

import javax.swing.JOptionPane;

public class LottoTest {


    public static void main(String[] args) {
        boolean ch = true;
        int choice;
        int turn = 1;
        int sum=0;

        //Instantiate object of lotto
        Lotto lot = new Lotto();

        JOptionPane.showMessageDialog(null, "Welcome To Lotto");
        do {
            //do while loop because it's easy to manage and break here by changing boolean value
            String c = JOptionPane.showInputDialog(null, "Enter Your choice- ");
            choice = Integer.parseInt(c);

            //Entered value should not exceed 27 and not less than 3
            if (choice < 3 || choice > 27) {
                //for not proper input, i,e value >27 or value<3
                JOptionPane.showMessageDialog(null, "OOps.... Wrong Entry !!!%n" +
                        "Number should be from 3 to 27");
                ch = true;
            } else {
                ch = false;
                break;
            }
        } while (ch = true);


        for (int i = 1; i < 6; i++) {
            lot.populate();
            for (int j : lot.showArray()) {
                sum += j;
            }
            if (choice==sum){
                JOptionPane.showMessageDialog(null, "System draw = " + sum + "\nYour Choice = " + choice + "\nYou Won.!!");
                sum=0;
            }
            else{
                JOptionPane.showMessageDialog(null,"System draw = " + sum + "\nYour Choice = " + choice + "\nYou have "+(5-turn)+" turns left.");
                turn++;
                sum=0;
            }
        }

    }
}
