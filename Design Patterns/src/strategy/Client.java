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
public class Client {
    private static LinkedList<Order> orders = new LinkedList<>();

    public static void main(String[] args) {
         createOrders();
        //print all orders
        PrintService service = new PrintService(new   DetailPrinter());
        service.printOrders(orders);
        
         service = new PrintService(new   SummaryPrinter());
        service.printOrders(orders);
        
    }

    private static void createOrders() {
        Order o1 = new Order("100");
        o1.addItem("Soda", 2);
        o1.addItem("Chips", 10);
        orders.add(o1);

        Order o2 = new Order("200");
        o2.addItem("Cake", 20);
        o2.addItem("Cookies", 5);
        o2.addItem("Cooeeeeeeeeeekies", 5);

        orders.add(o2);

        Order o3 = new Order("300");
        o3.addItem("Burger", 8);
        o3.addItem("Fries", 5);
        orders.add(o3);
    }
}
