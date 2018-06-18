package Assignment3.Ex3;

import java.util.Scanner;

public class ProcessMortgage {

        static Scanner input = new Scanner(System.in);

        public static void main(String[] args) {

            System.out.println("Welcome to Mortgage Service");
            System.out.println("Enter B for business mortgage\n" +
                   "Enter P for personal mortgage\n");

            //Polymorphism starts
            Mortgage[] mort = new Mortgage[3];

            //taking 3 entries
            for (int i = 0; i < 3; i++) {

                System.out.println("Entry# "+(i+1));
                System.out.println("Enter your name:- ");
                String mName = input.next();
                System.out.println("Enter your mortgage#:- ");
                Integer mNumber = input.nextInt();
                System.out.println("Enter your mortgage amount:- ");
                Integer mAmount = input.nextInt();
                System.out.println("Enter your current interest rate (rate/100):- ");
                double mRate = input.nextDouble();
                System.out.println("Enter your mortgage term:- ");
                Integer mTerm = input.nextInt();
                if(mTerm==null)
                    mTerm=1;
                System.out.println("Enter your type for mortgage#:-");
                String checkBP = input.next();

                //checking business or personal mortgage
                if (checkBP.toUpperCase().equals("B")) {
                    BusinessMortgage bm = new BusinessMortgage(mNumber,mName,mAmount,mRate,mTerm);
                    mort[i]=bm;
                    System.out.println("Your interest rate would be:- "+bm.getRate()+"%");
                    System.out.println("Total amount to be paid:- " + (bm.setAmount(mAmount)+(mTerm*bm.getRate()*bm.setAmount(mAmount))));
                } else if (checkBP.toUpperCase().equals("P")) {
                    PersonalMortgage pm = new PersonalMortgage(mNumber,mName,mAmount,mRate,mTerm);//rate written but it takes value from pm class
                    mort[i]=pm;
                    System.out.println("Your interest rate would be:- "+pm.getRate()+"%");
                    System.out.println("Total amount to be paid:- " + (pm.setAmount(mAmount)+(mTerm*pm.getRate()*pm.setAmount(mAmount))));
                } else {
                    System.out.println("Wrong input of mortgage type...\n Try again:- ");
                    i--;
                }
            }
            //Displaying the results
            System.out.println();
            for (int j = 1; j < mort.length+1; j++) {
                System.out.printf("Mortgage number " + j + " is of " + mort[j-1].getMortgageInfo()+"\n");
            }
        }
}
