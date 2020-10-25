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
public class Remote {
    
    Command[] onCommands;
    Command[] offCommands;

    
    public Remote(){
     onCommands= new  Command[2];
          offCommands= new  Command[2];
          for (int i = 0; i < onCommands.length; i++) {
              onCommands[i]=new NoCommond();
                          offCommands[i]=new NoCommond();

        }

    }
    public void setCommand(int index,Command onCommand,Command offCommand){
    
   this.onCommands[index]= onCommand;
      this.offCommands[index]= offCommand;

    
    }
    
    public void onONButtonPressed(int index){
    onCommands[index].execute();
    
    }
    public void onOFFButtonPressed(int index){
    offCommands[index].execute();
    
    }
    
    
}
