package Assignment2.Ex3;

public class Overload {

    public static double sum=0;//Global static declaration

    public static void main(String[] args) {

        System.out.printf("Multiplication of the above integers is- %d%n", mult(7,5));
        System.out.printf("Multiplication of the above integer and double is- %f%n" ,mult(5.33,6));
        System.out.printf("Multiplication of the above doubles is- %f%n " , mult(39.99,1.13));

        //Short program... So no new driver test class to test all methods.
        //JOptionPane not used as not mentioned... Just like that...
    }
    //Mult method # 1 with two integers
    public static int mult(int m1, int m2 ) {
        System.out.printf("[%d * %d]%n", m1,m2);
        return m1 * m2;
    }
    //Mult method # 2 containing double and integers
    public static double mult(double m1, double m2 ) {
        System.out.printf("[%s * %s]%n", m1,m2);
        sum = m1 * m2;
        return sum;
    }
    //Mult method # 3 with two doubles
    public static double mult(double m1, int m2 ) {
        System.out.printf("[%s * %d]%n", m1,m2);
        sum = m1 * m2;
        return sum;
    }
}

