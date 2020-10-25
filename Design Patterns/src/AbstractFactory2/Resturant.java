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
public interface Resturant {
    
    Pickles getpickles();
    Potatoes getPotatoes();
    Vegetables getVegetables();
    Chicken getChicken();
    void getCost();
    
}
