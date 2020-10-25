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
public class Light {
    String place ;
    public Light(String place){
    this.place=place;
    }
   public void on(){
    
       System.out.println("Light in"+place+"on " );
    }
   public void off(){
     
       System.out.println("Light in "+place+"off ");
    }
    
    
    
}
