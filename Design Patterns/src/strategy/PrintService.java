/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.util.LinkedList;

/**
 *
 * @author tarek
 */
public class PrintService {
    private OrderPrinter printer;
	
    public PrintService(OrderPrinter printer) {
    	this.printer = printer;
    }

    public void printOrders(LinkedList<Order> orders) {
        printer.print(orders);
    }
}
