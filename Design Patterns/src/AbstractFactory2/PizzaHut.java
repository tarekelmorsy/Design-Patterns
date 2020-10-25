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
public class PizzaHut implements Resturant{

    @Override
    public Pickles getpickles() {

        Pickles olive= new Olive();
        olive.type();
        olive.weight();
        return olive; 
        
    }

    @Override
    public Potatoes getPotatoes() {

        Potatoes potatoes=new CheeseFriedPotatoes();
        potatoes.type();
        return potatoes;

    }

    @Override
    public Vegetables getVegetables() {
 
        Vegetables v = new Tomatoes();
        v.type();
        v.weight();
        return v;
        
    }

    @Override
    public Chicken getChicken() {

        Chicken c=new FriedChicken();
        c.type();
        c.weight();
        return c;

    }

    @Override
    public void getCost() {
        System.out.println("50$");    }
    
}
