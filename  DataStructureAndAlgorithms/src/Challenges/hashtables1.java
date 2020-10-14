/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

/**
 *
 * @author tarek
 */
public class hashtables1 {
    
public static void main(String[] args) {

        int[] nums = new int[10];
        int[] numsToAdd = { 59382, 433, 6894, 500, 939};
        for (int i = 0; i < numsToAdd.length; i++) {
            nums[hash(numsToAdd[i])] = numsToAdd[i];
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static int hash(int value) {
        return Math.abs(value%10);

    }
}
