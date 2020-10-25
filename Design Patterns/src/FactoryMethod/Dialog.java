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
public abstract class Dialog {
    public void renderWindoe(){
    
        Button okButton = createButton();
        okButton.render();}
    
        public abstract Button createButton();

}
