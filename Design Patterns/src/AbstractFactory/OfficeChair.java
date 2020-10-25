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
public class OfficeChair implements Chair{

    @Override
    public void color() {
        System.out.println("OfficeChair color is : white");    }

    @Override
    public void shape() {
        System.out.println("this shape is office chair");    }
    
}
