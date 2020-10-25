/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AbstractFactory;

/**
 *
 * @author tarek
 */
public class MPQ implements Familys {

    @Override
    public Table getTable() {

        BigTable bigTable = new BigTable();
        bigTable.color();
        bigTable.length();
        bigTable.width();

        return bigTable;

    }

    @Override
    public Chair getChair() {
        Sofa sofa = new Sofa();

        sofa.color();
        sofa.shape();
        return sofa;

    }

}
