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
public class Recursion {
    
 public static void main(String[] args) {

        System.out.println(iterativeFactorial(3));
        System.out.println(recursiveFactorial(5));
    }
 


    public static int recursiveFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        return num * recursiveFactorial(num - 1);

    }

    
    // the best
    public static int iterativeFactorial(int num) {

        if (num == 0) {
            return 1;
        }

        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }

        return factorial;

    }
}
