/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactoryMethod;

/**
 *
 * @author tarek
 */
public class Demo {
        private static Dialog dialog;

    public static void main(String[] args) {
        
        configure("html");
        runBusinessLogic();
        System.out.println("------------------------------------------");
        configure("htmdfdl");
        runBusinessLogic();
        
    }
    public static void configure(String s){
        if (s=="html"){
            dialog=new HtmlDialog();
        
        }else{
        dialog=new WindowsDialog();
        }
    
    
    }
    public static void runBusinessLogic(){
    dialog.renderWindoe();}
}
