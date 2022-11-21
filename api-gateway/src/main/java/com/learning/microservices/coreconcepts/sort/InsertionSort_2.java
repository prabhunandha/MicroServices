package com.learning.microservices.coreconcepts.sort;

public class InsertionSort_2 {
    public static void main(String[] args) {
        int[] intArray = {20,35,-15,7,55,1,-22};

        for(int firstUnsortedIndex = 1; firstUnsortedIndex < intArray.length; firstUnsortedIndex++){
            int newElement = intArray[firstUnsortedIndex];
            System.out.println("New Element -->>"+newElement);
            int i;

            for(i = firstUnsortedIndex; i > 0 && intArray[i-1] > newElement; i--){
                System.out.println("in side:: i-->>"+i);
                intArray[i] = intArray[i-1];
            }
            System.out.println("out side:: i-->>"+i);
            intArray[i] = newElement;
            System.out.println();
        }
        for (int j : intArray) {
            System.out.println(j);
        }
    }
}
