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
        System.out.println(checkForPalindrome("vaaabbbcccdddv"));

        System.out.println(checkForPalindrome("I mdildk didi ?"));

    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<Character>();
        StringBuilder newarray = new StringBuilder(string.length());

        String originalArray = string.toLowerCase();

        for (int i = 0; i < string.length(); i++) {
            char cha = originalArray.charAt(i);
            if (cha >= 'a' && cha <= 'z') {
//We add a letter letter in the stack and newarray without punctuation
                stack.push(cha);
                newarray.append(cha);

            }

        }

        int charPalindrome = 0;
        int lenghtStack = stack.size();
        for (int i = 0; i < lenghtStack; i++) {
            char c = newarray.charAt(i);
            //If the two letters are palindrome, Plus one  in charPalindrome
            if (stack.pop().equals(c)) {
                charPalindrome++;
            }
        }
        //All letters are Palindromes
        if (charPalindrome == lenghtStack) {
            return true;
        }

        return false;
    }

//                                   or
//
//       StringBuilder arraycontrary= new StringBuilder();
//        
//        for (int i = 0; !stack.isEmpty(); i++) {
//arraycontrary.append(stack.pop());}
//        
//        return (arraycontrary.toString().equals(newarry.toString()));
//      }
}
