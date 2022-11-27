package com.learning.microservices.coreconcepts.lists;

public class PrePostIncrementTest {
    public static void main(String[] args) {
        System.out.println("Hii");

        int i = 4;
        int j = 7;

        int a = i--;
        System.out.println("a->"+a); // 4 4
        System.out.println("i->"+i); // 5 3

        int b = --j;
        System.out.println("b->"+b); // 8 6
        System.out.println("j->"+j); // 8 6


    }
}
