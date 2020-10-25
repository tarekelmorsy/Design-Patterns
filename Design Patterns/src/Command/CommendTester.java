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
public class CommendTester {
    public static void main(String[] args) {
        Light l=new Light("room");
        Fan fan =new Fan("bath");
        
        
        Command fanSpeedDowncommend=new FanSpeedDownCommend(fan);
        Command lightOfCommend =new  LightOffCommend(l);
         
        Command fanSpeedUpncommend=new FanSpeedUpCommend(fan);
        Command lightOnCommend =new  LightOnCommend(l);
        Remote remote= new Remote();
        remote.setCommand(0, lightOnCommend, lightOfCommend);
        remote.setCommand(1, fanSpeedUpncommend, fanSpeedDowncommend);
        remote.onOFFButtonPressed(0);
        remote.onONButtonPressed(0);
                remote.onONButtonPressed(1);

        remote.onOFFButtonPressed(1);
        
        
        
    }
    
}
