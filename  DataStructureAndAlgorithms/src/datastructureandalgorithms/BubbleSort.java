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
public class BubbleSort {
    
    
    
   // public static void main(String[] args) {
//int[] intarray={20,35,-15,7,55,1,-22};
//
//for (int lastIndex=intarray.length-1;lastIndex>0;lastIndex--){
//
//    for (int i=0;i<lastIndex;i++){
//        if (intarray[i]>intarray[i+1]){
//            swap(intarray,i,i+1);
//        }
//    }
//}
//for (int i=0;i< intarray.length;i++){
//    System.out.println(intarray[i]);
//}
//
//    }
//    public static void swap(int[] array,int i,int j){
//
//        if(i==j){
//            return;
//        }
//        int temp=array[i];
//        array[i]=array[j];
//        array[j]=temp;
//
//    }}
    
   
    public   void ss(int[] arr) {
         int n= arr.length;
         
         for (int i = 0; i<n-1;i++){
         
             for (int j=0;j<n-i-1;j++){
             if (arr[j] > arr[j+1]) 
                { 
                 int temp= arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
                }
             }
         }
               
        
    }
 
     public void printArray(int arr[]) 
    { 
        int n = arr.length; 
        for (int i=0; i<n; ++i) 
            System.out.print(arr[i] + " "); 
        System.out.println(); 
    } 
     public static void main(String[] args) {
         
         
                 BubbleSort ob = new BubbleSort(); 
                         int arr[] = {64, 34, 25, 12, 22, 11, 90}; 

                         ob.ss(arr);
                                 System.out.println("Sorted array"); 
        ob.printArray(arr); 


     
     }
     

}
    

 

 


    

