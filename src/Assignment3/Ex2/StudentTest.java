package Assignment3.Ex2;

import java.util.Scanner;

public class StudentTest {

    static Scanner input = new Scanner(System.in);
    static int notUsed = 0;

    public static void main(String[] args) {

        System.out.println("Welcome to Calculate Fees");
        System.out.println("Enter F if you are full time student\n" +
                "Enter P if you are part time student\n"
                +"Enter your choice:- ");
        String checkFT = input.next();//user inputs as f or p
        System.out.println("Enter your name:- ");
        String name = input.next();//users name

        checkFullTime(checkFT,name);
    }

    static void checkFullTime(String checkFT,String name) {


        if (checkFT.toUpperCase().equals("P")) {//If part time then this
            System.out.println("Please enter your allotted weekly hours:- \n");
            int hours = input.nextInt();
            PartTimeStudent pt = new PartTimeStudent(name);
            pt.setCreditHours(hours);
            System.out.println( "Hey " + name + ", your fees are $" +pt.getFees(hours));//Output
        }
        else if (checkFT.toUpperCase().equals("F")) {//If full time then this
            FullTimeStudent ft = new FullTimeStudent(name);
            ft.getFees(notUsed);
            System.out.println( "Hey " + name + ", your fees are $" + ft.getFees(notUsed));//Output
        }
        else
            System.out.println("Wrong input");
    }
}
