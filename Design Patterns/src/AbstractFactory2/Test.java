/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory2;

/**
 *
 * @author tarek
 */
public class Test {
    
    public static void main(String[] args) {
        Resturant  r1=new PizzaHut();
                Resturant  r2=new PizzaKing();
                r1.getChicken();
                r1.getPotatoes();
                 r1.getpickles();
                 r1.getCost();
                 
                 System.out.println("*************************************************");
                 r2.getChicken();
                r2.getPotatoes();
                 r2.getpickles();
                 r2.getCost();
                      

        
    }
    
}
