package com.learning.microservices.coreconcepts.lists;

public class PrePostIncrementTest {
    public static void main(String[] args) {
        System.out.println("Hii");

        int i = 4;
        int j = 7;

        int a = i--;
        System.out.println("a->"+a); // for ++ 4; for -- 4;
        System.out.println("i->"+i); // for ++ 5; for -- 3;

        int b = --j;
        System.out.println("b->"+b); // for ++ 8; for -- 6;
        System.out.println("j->"+j); // for ++ 8; for -- 6;


    }
}
