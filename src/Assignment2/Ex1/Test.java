package Assignment2.Ex1;

import javax.swing.*;

public class Test {

    public void simulateQuestion(){

    }
    public boolean checkAnswer(int answer){

    }
    public void generateMessage(){
        String[] positiveMessage = {"Excellent...!", "Good...!", "Keep it up...!", "Nice Work", "You'r doing great"};
        String[] negativeMessage = {"Oops... Wrong answer...","Wrong answer... Try another one...", "Don't give up...!", "Keep trying..."};

        JOptionPane.showMessageDialog(null,positiveMessage);

        JOptionPane.showMessageDialog(null,negativeMessage);
    }
    public int inputAnswer(String question){
        int answer;
        do {
            String x = JOptionPane.showInputDialog(question);
            answer = Integer.parseInt(x);

        } while (answer > 4 || answer < 1);
        return answer;
    }
    public void startTest{

        JOptionPane.showMessageDialog(null, "Welcome To Test");

        for(int i=0;i<5;i++)
        {
            JOptionPane.showMessageDialog(null,);
        }

    }

    public void questionBank() {
        String[] questions = {"What will be the return type of a method that not returns any value?",
                "How many primitive data types are there in Java?  ",
                "Size of int in bits in Java is",
                "When Overloading does not occur?",
                "Which concept of Java helps to adpot other class objects?"};
        String[][] options = {{"void","int","double","none of these"},
                {"6","7","8","9"},
                {"8","16","32","64"},
                {"More than one method with same name but different method signature and different number or type of parameters",
                        "More than one method with same name, same signature but different number of signature",
                        "More than one method with same name, same signature, same number of parameters but different type",
                        "More than one method with same name, same number of parameters and type but different signature"},
                {"Polymorphism","Encapsulation","Abstraction","Inheritance"}};
        int[] Answers = {1,3,3,4,4};

       /* for(int i=0;i<questions.length;i++){
            Question question = new Question(questionStatements[i],optionsList[i],correctAnswers[i]);
            questions.add(question);
        }*/
    }

}
