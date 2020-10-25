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
public class FanSpeedDownCommend implements Command{
     Fan fan  ;

    public FanSpeedDownCommend(Fan f ) {
        this.fan = f;
    }

    @Override
    public void execute() {
       fan.speedDown();
    }

    @Override
    public void unexecute() {
        fan.speedUp();
    }

}




