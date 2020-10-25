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
public class PriceObserver implements OrderObserver{
    
    @Override
	public void updated(Order order) {
		double cost = order.getItemCost();
		
		if(cost >= 500) {
			order.setDiscount(50);
		} else if(cost >= 200) {
			order.setDiscount(10);
		}
	}
    
}
