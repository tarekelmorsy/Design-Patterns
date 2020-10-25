/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Command;

/**
 *
 * @author tarek
 */
public class Fan {

    int speed = 0;
    String place;

    public Fan(String place) {
        this.place = place;
    }

    public void speedUp() {
        speed = (speed + 1 % 4);
        System.out.println("Increasing Fan speed in " + place + "to " + speed);
    }

    public void speedDown() {
        speed = (speed - 1 % 4);
        System.out.println("Decreasing Fan speed in " + place + "to " + speed);
    }

}
