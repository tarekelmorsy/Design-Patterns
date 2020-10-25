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
public class BigTable implements  Table{

    @Override
    public void length() {
        System.out.println("BigTable length is :30");    }

    @Override
    public void width() {
System.out.println("BigTable width is : 15");     }

    @Override
    public void color() {
System.out.println("BigTable color is : black");     }
    
}
