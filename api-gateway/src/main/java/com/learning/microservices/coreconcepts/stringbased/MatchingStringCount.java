package com.learning.microservices.coreconcepts.stringbased;

public class MatchingStringCount {
    public static void main(String[] args) {

        String fullStr = "abcdefabcghiabcjklabc";
        String subStr = "abc";
        int count=0;
        int length = subStr.length();
        int index=0;

        while((index = (fullStr.indexOf(subStr,index)) )!= -1){
            count++;
            index = index+length;
        }
        System.out.println("Total-->>"+count);


    }
}
