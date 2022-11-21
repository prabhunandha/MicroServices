package com.learning.microservices.coreconcepts.recursion;

public class recursive_4 {
    public static void main(String[] args) {
        System.out.println("The Factorial is ==>>"+iterativeFactorial(3));
        System.out.println("The Recursive Factorial is ==>>"+recursiveFactorial(4));

    }

    // Recursive way

    public static int recursiveFactorial(int num){
        if(num == 0) return 1;

        return num * recursiveFactorial(num - 1);
    }

    // Iterative way
    private static int iterativeFactorial(int i) {
        if(i == 0 ) return 1;
        int factorial = 1;
        for(int j = 1; j <=i; j++){
            factorial *= j;
        }
        return factorial;
    }
}
