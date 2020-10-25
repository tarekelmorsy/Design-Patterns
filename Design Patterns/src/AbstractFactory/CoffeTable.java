/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author tarek
 */
public class CoffeTable implements Table{

    @Override
    public void length() {
System.out.println("CoffeTable length is : 10");     }

    @Override
    public void width() {
System.out.println("CoffeTable width is: 5");     }

    @Override
    public void color() {
 System.out.println("CoffeTable color is : gray"); 

    }
    
}
