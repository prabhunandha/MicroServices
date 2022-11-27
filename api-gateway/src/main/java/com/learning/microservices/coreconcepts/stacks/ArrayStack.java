package com.learning.microservices.coreconcepts.stacks;

import java.util.EmptyStackException;

public class ArrayStack {

    private Employee[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack = new Employee[capacity];
    }

    public boolean isEmpty(){
        return 0 == top;
    }

    public void push(Employee employee){
        if(top == stack.length) {
            Employee[] newArray = new Employee[2 * stack.length];
            System.arraycopy(stack,0,newArray,0,stack.length);
            stack = newArray;
        }
        stack[top++] = employee;
    }

    public Employee pop(){
        if(isEmpty()) throw new EmptyStackException();
        Employee employee = stack[--top];
        stack[top] = null;
        return employee;
    }

    public void printStack() {
        if(isEmpty()) System.out.println("Nothing present..");
//        System.out.println("Top -->>"+top);
        for (int i = top-1; i >= 0; i--) {
            System.out.println(stack[i]);
        }
        // To reverse the order
//        System.out.println("______________");
//        for (int i = 0; i <= top-1; i++) {
//            System.out.println(stack[i]);
//        }
    }

    public Employee peek() {
        if(isEmpty()) throw new EmptyStackException();

        return stack[top-1];
    }
}
