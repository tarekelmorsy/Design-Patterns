/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarek
 */
public class EagerSingleton {
    
    private EagerSingleton() {
		        System.out.println("In Eager singleton");

	}

	private static final EagerSingleton INSTANCE = new EagerSingleton();
	
	public static EagerSingleton getInstance() {
		return INSTANCE;
	}
}
