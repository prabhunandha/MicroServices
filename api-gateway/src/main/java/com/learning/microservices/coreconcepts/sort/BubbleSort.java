package com.learning.microservices.coreconcepts.sort;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Bubble Sort...");

        int[] intArray = {12,-9,-3,23,5,100,23};

        for(int lastUnsortedIndex = intArray.length-1;lastUnsortedIndex > 0 ;lastUnsortedIndex--){
            for(int i = 0; i< lastUnsortedIndex; i++){
                if(intArray[i] > intArray[i +1]){
                    swap(intArray,i,i+1);
                }
            }
        }
        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
    }
    public static void swap(int[] intArray, int i, int j){
        int temp = intArray[i];
        intArray[i] = intArray[j];
        intArray[j] = temp;
    }
}
