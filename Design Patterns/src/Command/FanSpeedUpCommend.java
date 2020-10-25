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
public class FanSpeedUpCommend implements Command{

    Fan fan  ;

    public FanSpeedUpCommend(Fan f ) {
        this.fan = f;
    }

    @Override
    public void execute() {
       fan.speedUp();
    }

    @Override
    public void unexecute() {
        fan.speedDown(); 
    }

}


