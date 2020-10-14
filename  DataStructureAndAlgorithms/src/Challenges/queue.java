/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import java.util.LinkedList;

/**
 *
 * @author tarek
 */
public class queue {
     // should return true
    public static void main(String[] args) {
        
     
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
                System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("hellou"));

                System.out.println(checkForPalindrome("I dildk, did I?"));


    }

    public static boolean checkForPalindrome(String string) {

          LinkedList<Character> queue = new LinkedList<Character>();
          LinkedList<Character> stack = new LinkedList<Character>();
          
           String originalArry=string.toLowerCase();
 
         for (int i =0;i<string.length();i++){
         char cha = originalArry.charAt(i);
         if(cha>='a'&& cha<='z'){
         
         stack.push(cha);
         queue.add(cha);
       }}
                  

        while(!stack.isEmpty()){
             if(!stack.pop().equals(queue.removeFirst())){
                 return false;}
             
         }
         
        return true;}



    }
    
    

