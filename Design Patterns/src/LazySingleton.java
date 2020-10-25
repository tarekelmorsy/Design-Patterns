/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarek
 */
public class LazySingleton {

    private LazySingleton() {
        System.out.println("In Lazy singleton");
    }

    private static class LazyHolder {

        static LazySingleton INSTANACE = new LazySingleton();
    }

    public static LazySingleton getInstance() {
        return LazyHolder.INSTANACE;
    }
}
