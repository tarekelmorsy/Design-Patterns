/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bridge;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author tarek
 */
public class Radio implements Device{
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
      
      // add elements to the array list
      al.add("C");
      al.add("A");
      al.add("E");
      al.add("B");
      al.add("D");
      al.add("F");
System.out.print("Original contents of al: ");
      Iterator itr = al.iterator();
       while(itr.hasNext()) {
          System.out.print(itr.next() + " ");
      }


    }

    private boolean on = false;
    private int volume = 30;
    private int channel = 1;
    @Override
    public boolean isEnabled() {
return on;}

    @Override
    public void enable() {

        on= true;

    }

    @Override
    public void disable() {
        on = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
if (volume > 100) {
            this.volume = 100;
        } else if (volume < 0) {
            this.volume = 0;
        } else {
            this.volume = volume;
        }    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public void printStatus() {
 System.out.println("------------------------------------");
        System.out.println("| I'm Radio set.");
        System.out.println("| I'm " + (on ? "enabled" : "disabled"));
        System.out.println("| The volume of the sound " + volume + "%");
        System.out.println("| The current channel is " + channel);
        System.out.println("------------------------------------\n");    }
    
}
