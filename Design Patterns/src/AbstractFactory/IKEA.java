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
public class IKEA implements Familys{

    @Override
    public Chair getChair() {
        
        OfficeChair officeChair= new OfficeChair();
        officeChair.color();
        officeChair.shape();
return officeChair;}

    @Override
    public Table getTable() {
        CoffeTable coffeTable=new CoffeTable();
        coffeTable.length();
        coffeTable.width();
        coffeTable.color();
return coffeTable;
    }
    
}
