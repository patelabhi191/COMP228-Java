package Assignment1;
import javax.swing.*;
import java.util.Scanner;

public class GameObjectTest {
    public static void main(String[] args) {

        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);
        boolean cont = true;
        int choice;

        //Taking X and Y coordinates and finding center
        JOptionPane.showMessageDialog(null,"Enter the following details of our GameObject\nClick OK to continue");

        String xc = JOptionPane.showInputDialog(null,"X and Y coordinates for center\nEnter X- ");
        double x = Double.parseDouble(xc); //X Coordinate
        String yc = JOptionPane.showInputDialog(null,"X and Y coordinates for center\nEnter Y- ");
        double y = Double.parseDouble(yc); //Y Coordinate
        double center= (x + y)/2;//Center of 2 points

        //System.out.printf("State (1 for alive, 0 when died)- \n");
        String sstate = JOptionPane.showInputDialog(null,"State (true fo alive & false for dead)- ");
        String svelocity = JOptionPane.showInputDialog(null,"Initial velocity- ");
        String srotation = JOptionPane.showInputDialog(null,"Rotation- ");

        //String to their respective datatype conversion
        double velocity = Double.parseDouble(svelocity);
        double rotation = Double.parseDouble(srotation);
        boolean state= Boolean.parseBoolean(sstate);
        GameObject game = new GameObject(center, velocity, state, rotation);

        do {
            choice = Integer.parseInt(JOptionPane.showInputDialog("Updation Menu\n" +
                    "Press 1 to update X\nPress 2 to update Y\nPress 3 to update velocity\nPress 4 to update rotation\nPress 5 to update state\nPress 0 to break \nEnter your choice : "));
            switch (choice) {
                case 1:{
                    double xx = Double.parseDouble(JOptionPane.showInputDialog(null, "Update X- "));
                    x=xx; break;
                    }
                case 2:{
                    double yy = Double.parseDouble(JOptionPane.showInputDialog(null, "Update Y- "));
                    y=yy; break;}
                case 4: {
                    double uprotation = Double.parseDouble(JOptionPane.showInputDialog(null, "Update Rotation- "));
                        rotation = uprotation; break;
                    }
                case 3: {
                    double upvelocity = Double.parseDouble(JOptionPane.showInputDialog(null, "Update Velocity- "));
                        velocity = upvelocity; break;
                    }
                case 5:{
                    boolean stat = Boolean.parseBoolean(JOptionPane.showInputDialog(null,"Update State- "));
                    state=stat; break;
                    }
                case 0: {
                    cont = false;
                    break;
                    }
                default:
                    JOptionPane.showMessageDialog(null, "Invalid Entry");
            }
        } while (cont);

        //Display the result
        String out = game.ObjectDisplay(center, velocity, state, rotation);
        JOptionPane.showMessageDialog(null,out);
    }
}

