package Assignment1;

import javax.swing.*;

public class GameObject {

    double center;//As (X+Y)/2 could be decimal

    double velocity;
    boolean state; // 1=alive and 0=dead
    double rotation;// in degrees Eg-65.50
    //Getters

    public double getCenter() {
        return center;
    }
    public double getVelocity() {
        return velocity;
    }
    public boolean isState() {
        return state;
    }
    public double getRotation() {
        return rotation;
    }

    //setter for center
    public void setCenter(double center) {
        this.center = center;
    }

    //Constructor
    public GameObject(double center, double velocity,boolean state, double rotation) {
        this.center = center;
        this.velocity = velocity;
        this.state=state;
        this.rotation=rotation;
    }

    //Method to display all details
    String ObjectDisplay (double center, double velocity,boolean state, double rotation)
    {
        String dis = "Center would be " + center + "\nVelocity is " + velocity + "\nRotation Angle of " + rotation + "\nState of object " + state;
        return dis;
    }
}
