/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Challenges;

import static Challenges.queue.checkForPalindrome;
import java.util.LinkedList;

/**
 *
 * @author tarek
 */
public class stack {

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("abccba"));
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        System.out.println(checkForPalindrome("I did, did I?"));
        System.out.println(checkForPalindrome("hello"));
        System.out.println(checkForPalindrome("oooooooo"));
        System.out.println(checkForPalindrome("Don't nod"));
        System.out.println(checkForPalindrome("I mdildk did ?"));

    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder newarry = new StringBuilder(string.length());

        String originalArry = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            char cha = originalArry.charAt(i);
            if (cha >= 'a' && cha <= 'z') {

                stack.push(cha);
                newarry.append(cha);

            }

        }

       StringBuilder arrycontrary= new StringBuilder();
        
        for (int i = 0; !stack.isEmpty(); i++) {
arrycontrary.append(stack.pop());}
        
        return (arrycontrary.toString().equals(newarry.toString()));
      }

}


