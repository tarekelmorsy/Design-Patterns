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
public class GrilledChicken implements Chicken{

    @Override
    public void weight() {
        System.out.println("30g");
    }

    @Override
    public void type() {
        System.out.println("GrilledChicken");
    }
    
}
