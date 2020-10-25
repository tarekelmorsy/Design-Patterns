/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author tarek
 */
public class Client {
    public static void main(String[] args) {
        Order order = new  Order("tarek");
        	PriceObserver price = new PriceObserver();
                order.attach(price);
             
                QuantityObserver quant = new QuantityObserver();
    	order.attach(quant);
        order.addItem(50);
                order.addItem(50);

    	order.addItem(179);
            	System.out.println(order);
        
    }
    
              
    
    
}
