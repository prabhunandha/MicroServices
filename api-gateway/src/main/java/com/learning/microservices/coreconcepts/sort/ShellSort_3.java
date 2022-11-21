package com.learning.microservices.coreconcepts.sort;

public class ShellSort_3 {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};
        for(int gap = intArray.length/2; gap>0; gap /=2){
            //The below code is almost similar to Insertion sort code. Also, we can apply the above technique of
            // finding the gap and starting with that gap rather than immediate neighbour element to Bubble
            // sort as well.
            for(int i = gap; i<intArray.length;i++){
                int newElement = intArray[i];
                int j=i;
                while(j>=gap && intArray[j-gap] > newElement){
                    intArray[j] = intArray[j-gap];
                    j -= gap;
                }
                intArray[j] = newElement;
            }
        }
        for(int k:intArray){
            System.out.println(k);
        }
    }
}
