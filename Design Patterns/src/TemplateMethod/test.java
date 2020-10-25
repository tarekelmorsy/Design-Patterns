/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TemplateMethod;

/**
 *
 * @author tarek
 */
public class test {
    public static void main(String[] args) {
        Coffee coffee=new Coffee();
        
        coffee.boilthewater();
        coffee.addSugar();
        coffee.addTyp();
        coffee.additions();
        Tea tea  =new Tea();
        
        System.out.println("************************************");
        
        tea.boilthewater();
        tea.addSugar();
        tea.addTyp();
        tea.additions();
        
    }
    
}
