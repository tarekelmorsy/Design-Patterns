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
public class PizzaKing implements Resturant{
    
    @Override
    public Pickles getpickles() {

        Pickles p= new  PickledCucumber();
        p.type();
        p.weight();
        return p; 
        
    }

    @Override
    public Potatoes getPotatoes() {

        Potatoes potatoes=new FriedPotatoes();
        potatoes.type();
        return potatoes;

    }

    @Override
    public Vegetables getVegetables() {
 
        Vegetables v = new Pepper();
        v.type();
        v.weight();
        return v;
        
    }

    @Override
    public Chicken getChicken() {

        Chicken c=new GrilledChicken();
        c.type();
        c.weight();
        return c;

    }

    @Override
    public void getCost() {
        System.out.println("40$");    }
    
}

