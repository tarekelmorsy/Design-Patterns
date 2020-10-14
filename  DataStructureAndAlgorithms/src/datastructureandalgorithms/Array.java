/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datastructureandalgorithms;

import static Challenges.queue.checkForPalindrome;
import java.util.LinkedList;

/**
 *
 * @author tarek
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("helloh"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
                        System.out.println(checkForPalindrome("I dildk, did I?"));

    }

    public static boolean checkForPalindrome(String string) {

        LinkedList<Character> stack = new LinkedList<Character>();
        LinkedList<Character> queue = new LinkedList<Character>();
        String lowerCase = string.toLowerCase();

        for (int i = 0; i < lowerCase.length(); i++) {
            char c = lowerCase.charAt(i);
            if (c >= 'a' && c <= 'z') {
                queue.addLast(c);
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            if (!stack.pop().equals(queue.removeFirst())) {
                return false;
            }
        }

        return true;
    }
}
        
//        
//        Employee tarek=new Employee("tarek", "mohamed", 4);
//                Employee omar=new Employee("omar", "ali", 44);
//        Employee mohamed=new Employee("mohamed", "tarek", 14);
//        Employee gemy=new Employee("mostafa", "gamal", 34);
//        ArrayQueue arrayQueue= new ArrayQueue(5);
//        arrayQueue.add(gemy);
//        arrayQueue.add(tarek);
//        arrayQueue.printQueue();
//        arrayQueue.add(omar);
//        arrayQueue.add(mohamed);
//                arrayQueue.printQueue();
//    
//            System.out.println(checkForPalindrome("Don't nod"));
//    }
// public static boolean checkForPalindrome(String string) {
//
//        LinkedList<Character> stack = new LinkedList<Character>();
//        LinkedList<Character> queue = new LinkedList<Character>();
//        String lowerCase = string.toLowerCase();
//
//        for (int i = 0; i < lowerCase.length(); i++) {
//            char c = lowerCase.charAt(i);
//            if (c >= 'a' && c <= 'z') {
//                queue.addLast(c);
//                stack.push(c);
//            }
//        }
//
//        while (!stack.isEmpty()) {
//            if (!stack.pop().equals(queue.removeFirst())) {
//                return false;
//            }
//        }
//
//        return true;
//    
//        
// 
//    }
////     int[] arry= new int[7];
//        
//        arry[0]= 10;
//        arry[1]= 18;
//        arry[2]= 7;
//        arry[3]= 3;
//        arry[4]= 90;
//        arry[5]= 1009;
//        arry[6]= 5;
//        
//        int t=-1;
//        for(int i=0;i<arry.length;i++){
//            System.out.println(arry[i]);
//            if(arry[i]==3){
//            t=i;
//            }
//        
//        
//        }
//        System.out.println(t);
//
//    }

