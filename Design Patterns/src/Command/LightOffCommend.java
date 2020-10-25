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
public class LightOffCommend implements Command{
 
    Light light;

    public LightOffCommend(Light l) {
        this.light = l;
    }

    @Override
    public void execute() {
        light.off();
    }

    @Override
    public void unexecute() {
        light.on();
    }

}

