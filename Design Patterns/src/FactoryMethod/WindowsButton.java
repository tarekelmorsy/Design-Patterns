/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

import javax.swing.JPanel;

/**
 *
 * @author tarek
 */
public class WindowsButton implements Button{

    @Override
    public void render() {
        System.out.println(" Test Button ");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Hello World!");
    }
    
    
}
