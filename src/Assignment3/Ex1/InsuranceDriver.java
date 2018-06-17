package Assignment3.Ex1;

import java.util.Scanner;
public class InsuranceDriver {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcome to Insurance Service");
        System.out.println("Enter L if you need Life Insurance\n" +
                "Enter H if you need Health Insurance\n");

        Insurance[] ins = new Insurance[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter your insurance type# "+(i+1)+":- ");
            String checkLH = input.next();//user inputs as l or h
            System.out.println("Enter your monthly fees:- ");
            Integer fees = input.nextInt();//monthly fees input


            if (checkLH.toUpperCase().equals("L")) {//If life insurance
                Life l = new Life("Life Insurance",fees);
                ins[i] = l;
            } else if (checkLH.toUpperCase().equals("H")) {//If health insurance
                Health h = new Health("Health Insurance",fees);
                ins[i] = h;
            } else {
                System.out.println("Wrong input of insurance type...\n Try again:- ");
                i--;
            }
        }

        for (int j = 1; j < ins.length+1; j++) {
            System.out.printf("Insurances number " + j + " is of " + ins[j-1].displayInfo());
        }


    }
}

