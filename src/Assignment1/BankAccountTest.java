package Assignment1;
import javax.swing.*;
import java.util.Scanner;

public class BankAccountTest {

    public static void main(String[] args) {

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        //JOptionPane methods not used here for input, as i have made program
        // that can have multiple transaction... So on console...

        //Details entry of accounts
        System.out.println("Enter the banking details carefully:-");
        System.out.printf("Accountholder name- ");
        String name = input.nextLine();
        System.out.printf("Balance- ");
        double balance = Double.parseDouble(input.nextLine());

        BankAccount account = new BankAccount(name,balance );

        // display initial balance at SCREEN
        System.out.printf("%s have balance: $%.2f%n",
                account.getName(), account.getBalance());

        //for loop for selection of Withdraw or Deposit
        int i;
        for(i=0;i<5;i++) {
            System.out.println("Enter 1 to Deposit,\n2 to withdraw,\n3 to exit");
            int option = input.nextInt();
        if(option==1)
        {
            //Deposit method
            System.out.printf("Enter amount to be deposited- $");
            double depositAmount = input.nextDouble();
            //Add to account's balance
            account.deposit(depositAmount);

            // display balance
            JOptionPane.showMessageDialog(null, "Balance- $" + account.getBalance());
           /*System.out.printf("%s balance: $%.2f as of now%n",
                    account.getName(), account.getBalance());*/
           i=1;
        }
        else if(option==2) {
            //Withdraw method
            System.out.printf("Enter amount to be withdrawn- $");
            double withdrawAmount = input.nextDouble();

            //Subtract to account's balance
            account.withdraw(withdrawAmount);

            // display balance
            JOptionPane.showMessageDialog(null,"Balance- $" + account.getBalance());
            /*System.out.printf("%s has balance: $%.2f as of now%n",
                    account.getName(), account.getBalance());*/
            i=1;
        }
        else if(option==3){i=10;
            JOptionPane.showMessageDialog(null,"Available balance after all transections- " + account.getBalance());
        }
        else
        {
            System.out.printf("Invalid Choice...");
        }
        }
    }
}
