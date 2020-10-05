/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureandalgorithms;

/**
 *
 * @author tarek
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
 


        int[] arry= new int[7];
        
        arry[0]= 10;
        arry[1]= 18;
        arry[2]= 7;
        arry[3]= 3;
        arry[4]= 90;
        arry[5]= 1009;
        arry[6]= 5;
        
        int t=-1;
        for(int i=0;i<arry.length;i++){
            System.out.println(arry[i]);
            if(arry[i]==3){
            t=i;
            }
        
        
        }
        System.out.println(t);

    }
    
}
