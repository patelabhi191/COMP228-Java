package Assignment;

import javax.swing.*;
import java.util.Scanner;

public class GameObjectTest {
    public static void main(String[] args) {

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        //Taking X and Y coordinates and finding center
        System.out.printf("Enter the following details of our GameObject\n");
        System.out.printf("X and Y coordinates followed by enter key\n");
        System.out.printf("X- ");//X Coordinate
        Integer xc = Integer.parseInt(input.nextLine());
        System.out.printf("Y- ");//Y Coordinate
        Integer yc = Integer.parseInt(input.nextLine());
        double center= (xc + yc)/2;//Center of 2 points

        //System.out.printf("State (1 for alive, 0 when died)- \n");
        String sstate = JOptionPane.showInputDialog(null,"State (1 for alive, 0 when died)- ");
        String svelocity = JOptionPane.showInputDialog(null,"Initial velocity- ");
        String srotation = JOptionPane.showInputDialog(null,"Rotation- ");

        //String to their respective datatype
        double velocity = Double.parseDouble(svelocity);
        double rotation = Double.parseDouble(svelocity);
        boolean state= Boolean.parseBoolean(sstate);
        GameObject game = new GameObject(center, velocity, state, rotation);

        String out = game.ObjectDisplay(center, velocity, state, rotation);
        JOptionPane.showMessageDialog(null,out);
    }
}
