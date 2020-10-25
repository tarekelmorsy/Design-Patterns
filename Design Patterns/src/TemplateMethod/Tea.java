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
public class Tea extends HotDrink{

    @Override
    void additions() {

        System.out.println( 
"Add lemon");
    }

    @Override
    void addTyp() {

        System.out.println("typ is tea");
    }
    
}
