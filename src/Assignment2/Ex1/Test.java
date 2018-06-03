package Assignment2.Ex1;

import javax.swing.*;
import java.security.SecureRandom;
import java.util.Random;

public class Test {
    boolean correct=false;//for comparison of answers with user's input
    boolean result=false;//for printing positive or negative message
    int right =0;
    int wrong =0;
    SecureRandom random = new SecureRandom();

    //question bank and it's generator
    public String simulateQuestion(int number) {
        String[] questions = {"1. What will be the return type of a method that not returns any value?",
                "2. How many primitive data types are there in Java?  ",
                "3. Size of int in bits in Java is",
                "4. When Overloading does not occur?",
                "5. Which concept of Java helps to adpot other class objects?"};
        String[] options = {"1. void              2. int \n3. double         4. none of these",
                "1. 6                2. 7\n3. 8                4. 9",
                "1. 8                2. 16\n3. 32              4. 64",
                "1. More than one method with same name but different method signature and different number or type of parameters\n2. More than one method with same name, same signature but different number of signature \n3. More than one method with same name, same signature, same number of parameters but different type\n4. More than one method with same name, same number of parameters and type but different signature",
                "1. Polymorphism   2. Encapsulation\n3. Abstraction        4. Inheritance"};

            String a = questions[number] + "\n" + options[number];
            return a;
    }

    //checks the user's answer
    public boolean checkAnswer(int answer,int number) {
        int[] Answers = {1, 3, 3, 4, 4};
        if(answer == Answers[number]) {
            correct = true;
            right++;//write answer
        }
        else{
            correct = false;
            wrong++;//count of wrong answer
        }
        return correct;
    }

    //generate motivational messages
    public void generateMessage(boolean result) {
        String[] positiveMessage = {"Excellent...!", "Good...!", "Keep it up...!", "Nice Work", "You'r doing great"};
        String[] negativeMessage = {"Oops... Wrong answer...","Sorry... Wrong answer...", "Wrong answer... Try another one...", "Don't give up...!", "Keep trying..."};
        if(result==true)
        JOptionPane.showMessageDialog(null, positiveMessage[random.nextInt(5)]);
        else
        JOptionPane.showMessageDialog(null, negativeMessage[random.nextInt(5)]);
    }

    //takes the input from user
    //validation (entry should be between 1-4) not done as not mentioned and out of time...
    public int inputAnswer(String question) {
        String astring= JOptionPane.showInputDialog(null, question);
        int ans = Integer.parseInt(astring);
        return ans;
    }

    //main function which runs all other function
    public void startTest(){

        JOptionPane.showMessageDialog(null, "Welcome To Test");
        for (int i = 0; i < 5; i++)
            generateMessage(checkAnswer(inputAnswer( simulateQuestion(i)),i));
        //Result shown here
        JOptionPane.showMessageDialog(null,"Marks scored- " + right + "\nOut of- " + (right+wrong) +"\nWrong score- " + wrong +"\nPercentage- "+(right*20)+"%");
    }
}


