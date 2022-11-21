package com.learning.microservices.coreconcepts.sort;

public class QuickSort_6 {
    public static void main(String[] args) {
//        int[] intArray = {20,35,-15,7,55,1,-22};
        int[] intArray = {20,35,15};
        quickSort(intArray,0,intArray.length);
        for(int i : intArray){
            System.out.println(i);
        }
    }

    private static void quickSort(int[] intArray, int start, int end) {
        if(end - start < 2) return;

        int pivotIndex = partition(intArray, start, end);
        quickSort(intArray, start, pivotIndex);
        quickSort(intArray, pivotIndex+1, end);
    }
//    {20,35,15};
    private static int partition(int[] intArray, int start, int end) {
        int pivot = intArray[start];
        int i = start;
        int j = end;

        while(i < j){
            // empty loop body just to get the index of j where it's value > pivot
            // this is right to left traversing
            while (i < j && pivot <= intArray[--j]);
            if(i < j) {
                intArray[i] = intArray[j];
            }
            // empty loop body just to get the index of i where it's value < pivot
            // this is left to right traversing
            while(i<j && pivot >= intArray[++i]);
            if(i < j) {
                intArray[j] = intArray[i];
            }
        }
        intArray[j] = pivot;
        return j;
    }
}
