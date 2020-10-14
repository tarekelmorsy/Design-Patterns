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
public class MergeSort {
      public static void main(String[] args) {
     int[] intArray = { 20, 35, -15, 7, 55, 1, -22 };
      }
      
      // { 20, 35, -15, 7, 55, 1, -22 }
    public static void mergeSort(int[] input, int start, int end) {
 
        // condition : evrry array has 1 element so it is splitted
        if (end - start < 2) {
            return;
        }

        // defining the mid index
        int mid = (start + end) / 2;
        // left array splitting
        mergeSort(input, start, mid);
        // right array splitting
        mergeSort(input, mid, end);
        merge(input, start, mid, end);
    }

      }
    

