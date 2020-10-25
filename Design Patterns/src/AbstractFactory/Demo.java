/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

import javax.swing.UIManager;

/**
 *
 * @author tarek
 */
public class Demo {
    
    static Familys familys;
    public static void main(String[] args) {
         gettt("t");
          gettt("ikea");
     
        
    }
    
    public static void gettt( String string) {
        if(string== "ikea"){
            familys=new IKEA();
            familys.getTable();
                     System.out.println("-------------------------");

            familys.getChair();
        
        }else{
        familys= new MPQ();
        familys.getTable();
                 System.out.println("-------------------------");

            familys.getChair();
        }
        
    }
    
}
