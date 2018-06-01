package Assignment2.Ex2;

import java.security.SecureRandom;

public class Lotto {

    private static final SecureRandom randomNumbers = new SecureRandom();
    static int alotto[] = new int[3];
    public int summ=0;

    //Constructor linking to method which randomly populate the array
    public Lotto(){
        populate();
    }

    //method to populate the array
    public void populate () {
        for (int i = 0; i < 3; i++) {
            alotto[i] = 1 + randomNumbers.nextInt(9);
        }
    }

   //Method to show the array
    public static int[] showArray(){
        return alotto;
    }

}
