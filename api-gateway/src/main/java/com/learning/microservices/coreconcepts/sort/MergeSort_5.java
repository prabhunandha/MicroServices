package com.learning.microservices.coreconcepts.sort;

public class MergeSort_5 {


    private static void conquer(int[] arr, int si, int mid, int ei) {
        int[] merged = new int[ei-si+1];

        int idx1 = si;
        int idx2 = mid+1;
        int x = 0;

        while(idx1 <= mid && idx2 <= ei){
            if(arr[idx1] <= arr[idx2]){
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }
        while(idx1 <= mid){
            merged[x++] = arr[idx1++];
        }
        while(idx2 <= ei){
            merged[x++] = arr[idx2++];
        }
        System.arraycopy(merged,0,arr,si,merged.length);
//        for(int i=0, j = si; i<merged.length; i++, j++){
//            arr[j] = merged[i];
//        }
    }

    // {20,35,-15,7,55,1,-22};
    public static void divide(int[] arr, int si, int ei){
        if(si >= ei){
            return;
        }
        int mid = si + (ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);
    }
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};
//        int[] intArray = {20,35,-15};
        int n = intArray.length;
        divide(intArray,0,n-1);
        for(int i : intArray){
            System.out.println(i);
        }
    }


}
