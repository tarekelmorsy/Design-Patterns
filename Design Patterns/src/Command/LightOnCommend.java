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
public class LightOnCommend implements Command {

    Light light;

    public LightOnCommend(Light l) {
        this.light = l;
    }

    @Override
    public void execute() {
        light.on();
    }

    @Override
    public void unexecute() {
        light.off();
    }

}
