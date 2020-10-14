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

public class tests {
        public static void main(String[] args) {
 
    int[] intarray={20,35,1,-15,7,55,1,-22};
            int[] intArray = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };

    //bubbleSort(intarray);
  countingSort(intArray,1,10);
            //selctionSort(intarray);
            //shellSort(intarray);
        }
                        //it is implementation the counting Sort        

          public static void countingSort(int[] inputArray, int min, int max) {
          int []coutArry=new int[max-min+1];
          for (int i=0;i<inputArray.length;i++){
              coutArry[inputArray[i]-min]++;
          }
          int j=0;
          
          for(int i=min;i<=max;i++)
          {
              while (coutArry[i-min]>0) {
                   
                  inputArray[j++]=i;
                  coutArry[i-min]--;
                  
              }
          
          }          
          for (int i = 0; i < inputArray.length; i++) {
            System.out.println(inputArray[i]);}}
        
        
                //it is implementation the shell Sort            

        public static void shellSort (int[]array) {
            for (int jap= array.length/2;jap>0;jap/=2){
            
                for (int i=jap;i<array.length;i++){
                
                int newElement=array[i];
                int j=i;
                while(j>=jap&&array[j-jap]<newElement){
                
                    array[j]=array[j-jap];
                    j-=jap;
                }
                array[j]=newElement;

                }
            }
            for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
    }
        //it is implementation the insertion Sort            

         public static void insertionSort(int[]intarray) {
            for (int firstUnsortedIndex=1;firstUnsortedIndex<intarray.length;firstUnsortedIndex++){
            
                int i;
                int newElement=intarray[firstUnsortedIndex];
                for(i=firstUnsortedIndex;i>0 && intarray[i-1]>newElement;i--){
                    intarray[i]=intarray[i-1];
                    
             
              }
               intarray[i]=newElement;
            
            }
            for (int i = 0; i < intarray.length; i++) {
            System.out.println(intarray[i]);
        }
        
    }
          
//it is implementation the selection Sort            
        public static void selctionSort(int[]intarray) {
                
    for (int lastUnsortedIndex= intarray.length-1;lastUnsortedIndex >1;lastUnsortedIndex--){
        int big=0;
        for (int i=1;i<=lastUnsortedIndex;i++){
        
            if(intarray[i]>intarray[big]){
            
                big= i;
            }
            
        }
        swap(intarray,big,lastUnsortedIndex);
    }
     for (int i = 0; i < intarray.length; i++) {
            System.out.println(intarray[i]);
        }
            }
        
        //it is implementation the bubble Sort
    public static void bubbleSort(int[]intarray) {
        boolean swapped; 

 
    swapped=false;
for (int lastIndex=1;lastIndex<intarray.length;lastIndex++){

    for (int i=0;i<intarray.length-1;i++){
        if (intarray[i]<intarray[i+1]){
            swap(intarray,i,i+1);
            swapped=true;
        }
        
    }
    if(swapped==false){
    break;
    }
}
for (int i=0;i< intarray.length;i++){
    System.out.println(intarray[i]);
}

    }
public static void swap(int[] array,int i,int j){

        if(i==j){
            return;
        }
        int temp=array[i];
        array[i]=array[j];
        array[j]=temp;

    }}
    



    
        
    

    
    

