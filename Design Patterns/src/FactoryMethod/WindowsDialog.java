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
public class WindowsDialog extends Dialog{

    @Override
    public Button createButton() {

        return new WindowsButton();

    }
    
}
