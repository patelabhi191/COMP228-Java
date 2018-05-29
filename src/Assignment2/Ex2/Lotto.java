package Assignment2.Ex2;

import java.security.SecureRandom;

public class Lotto {

    private static final SecureRandom randomNumbers = new SecureRandom();
    int[] alotto ={};
    int sum=0;

    public Lotto (){
        for (int i=0;i<3;i++ )
        {
            alotto[i] =1 + randomNumbers.nextInt(9);
            
        }
    }
}
