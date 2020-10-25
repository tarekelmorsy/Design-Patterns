/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

/**
 *
 * @author tarek
 */
public class Demo {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("test from BasicRemote .");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        
        basicRemote.volumeDown();
        
        device.printStatus();
        device.setVolume(50);
                basicRemote.volumeDown();

        

        System.out.println("test from AdvancedRemote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
