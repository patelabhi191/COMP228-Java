import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Create instance
        Account myAccount = new Account();

        //Display default account
        System.out.printf("Initial name is %s%n%n", myAccount.getName());

        System.out.println("Please enter your name- ");
        String accName = input.nextLine();
        myAccount.setName(accName);
        System.out.printf("Name of account is- %s%n", myAccount.getName());
    }
}
