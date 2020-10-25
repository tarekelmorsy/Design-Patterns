/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderPattern;

import javax.swing.JOptionPane;

/**
 *
 * @author tarek
 */
public class BuilderPatternDemo {

    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        System.out.println("  Hello what is your name ");
        String name = JOptionPane.showInputDialog(null, " Hello what is your name");

        boolean w;

        String input;
        char inputt, enter;
        input = JOptionPane.showInputDialog(null, " welcom :" + name + "  \nplese enter \n1 meal Veg Meal \n or \n 2 :meal NonVeg Meal ");
        enter = (input).charAt(0);
        if (enter == '1') {

            Meal vegmeal = mealBuilder.prepareVegMeal();

            System.out.println("Veg Meal");

            vegmeal.showItems();
            System.out.println("Total Cost: " + vegmeal.getCost());
        } else {
            Meal nonvegmeal = mealBuilder.prepareNonVegMeal();
            System.out.println("NonVeg Meal");

            nonvegmeal.showItems();
            System.out.println("Total Cost: " + nonvegmeal.getCost());
        }

    }

}
