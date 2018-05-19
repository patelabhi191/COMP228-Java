package Assignment;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class PatientTest{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Taking values from users
        System.out.println("Enter the patients details:-");
        System.out.printf("ID- ");
        int Id = Integer.parseInt(input.nextLine());
        System.out.printf("Firstname- ");
        String FirstName = input.nextLine();
        System.out.printf("Lastname- ");
        String LastName = input.nextLine();
        System.out.printf("Address with house number and street name- ");
        String Address = input.nextLine();
        System.out.printf("City- ");
        String City = input.nextLine();
        System.out.printf("Province- ");
        String Province = input.nextLine();
        System.out.printf("Postal Code- ");
        String pc = input.nextLine();

        //Instantiating...
        Patient pi= new Patient(Id,FirstName,LastName,Address,City,Province,pc);
        //String to record all things in formatted way
        String output= pi.getPatientinfo();
        System.out.printf(output);
    }
}