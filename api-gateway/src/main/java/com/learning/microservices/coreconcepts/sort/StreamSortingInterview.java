package com.learning.microservices.coreconcepts.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortingInterview {

    // sort the binary array  
    public static void main(String[] args) {
        Integer[] intArr = {0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0,0,1,1,0};

//        1st Solution
//        List<Integer> intList = Arrays.asList(intArr);
//        List<Integer> finalList = intList.stream().sorted().collect(Collectors.toList());
//
//        System.out.println("Final--->>"+finalList);

        //        2nd Solution
        System.out.println("Distinct count "+Arrays.stream(intArr).distinct().count());
        List<Integer> zeroList = Arrays.stream(intArr).filter(e -> e.intValue() == 0).collect(Collectors.toList());
        List<Integer> oneList = Arrays.stream(intArr).filter(e -> e.intValue() == 1).collect(Collectors.toList());

        List<Integer> finalList = new ArrayList<>();
        finalList.addAll(zeroList);
        finalList.addAll(oneList);
        System.out.println("Final "+finalList);

        //        3rd Solution
        for(int lastUnsortedIndex = intArr.length-1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for (int i = 0; i < lastUnsortedIndex ; i++){
                if(intArr[i] > intArr[i+1]){
                    swap(intArr, i, i+1);
                }
            }
        }

        for (int i = 0; i < intArr.length; i++) {
//            System.out.println(intArr[i]);
        }
    }

    public static void swap(Integer[] intArr, int i,int j){
        int temp = intArr[i];
        intArr[i] = intArr[j];
        intArr[j] = temp;
    }
}
