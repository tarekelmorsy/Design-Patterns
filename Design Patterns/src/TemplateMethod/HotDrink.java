/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author tarek
 */
public abstract class HotDrink {
    
   public void boilthewater(){
       System.out.println(" start Boil the water");
   }
   public void addSugar(){
       System.out.println(" add Sugar");
   }
   abstract void additions();
   abstract void addTyp();
}
