package Assignment2.Ex2;

import javax.swing.JOptionPane;

public class LottoTest {

    public enum Status {CONTINUE, WON, LOST};

    public static void main(String[] args) {
        boolean ch = true;
        int choice;
        int turn = 1;
        int sum=0;
        Status status = Status.CONTINUE;


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
            }//Boolean ch is limited for validation of Entry made by user only.
        } while (ch = true);


        for (int i = 1; i < 6; i++) {
            lot.populate();
            //for loop to add those 3 randon numbers
            for (int j : lot.showArray()) {
                sum += j;
            }
            if (choice==sum){
                JOptionPane.showMessageDialog(null, "System draw = " + sum + "\nYour Choice = " + choice + "\nYou Won.!!");
                sum=0;
                status=Status.WON;
                break;
            }
            else{
                JOptionPane.showMessageDialog(null,"System draw = " + sum + "\nYour Choice = " + choice + "\nYou have "+(5-turn)+" turns left.");
                turn++;
                sum=0;
            }
            if (turn>5)
                status = Status.LOST;
        }
        if(status == Status.LOST)
            JOptionPane.showMessageDialog(null,"Your turns are over... Computer wins...");
    }
}
