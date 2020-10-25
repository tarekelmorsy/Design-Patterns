/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tarek
 */
public class Singleton {

    public static void main(String[] args) {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        LazySingleton lazySingldeton = LazySingleton.getInstance();
        LazySingleton lazySingletosn = LazySingleton.getInstance();
        LazySingleton lazySingletqon = LazySingleton.getInstance();

        System.out.println("-----------------------------------------");

        EagerSingleton eagerSingleton = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton3 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton4 = EagerSingleton.getInstance();

    }

}
