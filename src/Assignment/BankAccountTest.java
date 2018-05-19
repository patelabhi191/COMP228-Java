package Assignment;
import javax.swing.*;
import java.util.Scanner;

public class BankAccountTest {

    public static void main(String[] args) {

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

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

        //Deposit method
        System.out.printf("Enter amount to be deposited- ");
        double depositAmount = input.nextDouble();

        //Add to account's balance
        account.deposit(depositAmount);

        // display balance
        JOptionPane.showMessageDialog(null, account.getBalance());
       /*System.out.printf("%s balance: $%.2f as of now%n",
                account.getName(), account.getBalance());*/

        //Withdraw method
        System.out.printf("Enter amount to be withdrawn- ");
        double withdrawAmount = input.nextDouble();

        //Subtract to account's balance
        account.withdraw(withdrawAmount);

        // display balance
         JOptionPane.showMessageDialog(null, account.getBalance());
        /*System.out.printf("%s has balance: $%.2f as of now%n",
                account.getName(), account.getBalance());*/
       }
}
