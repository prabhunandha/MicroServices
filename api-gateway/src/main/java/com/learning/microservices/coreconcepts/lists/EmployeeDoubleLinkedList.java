package com.learning.microservices.coreconcepts.lists;

public class EmployeeDoubleLinkedList {
    private EmployeeNode head;
    private int size;
    private EmployeeNode tail;

    public void addToFront(Employee employee){
        EmployeeNode employeeNode =  new EmployeeNode(employee);
        employeeNode.setNext(head);
        if(head == null) {
            tail = employeeNode;
        } else {
            head.setPrevious(employeeNode);
        }

        head = employeeNode;
        size++;
    }

    public void addToEnd(Employee employee){
        EmployeeNode employeeNode = new EmployeeNode(employee);

        if(tail == null){
            head = employeeNode;
        } else {
            tail.setNext(employeeNode);
            employeeNode.setPrevious(tail);
        }
        tail = employeeNode;
        size++;
    }

    public void printLL(){
        EmployeeNode currentNode = head;
        System.out.println("Head ->");
        while(currentNode != null) {
            System.out.print(currentNode);
            System.out.println(" <=> ");
            currentNode = currentNode.getNext();
        }
        System.out.println(" null ");
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
//        return 0 == size;
        return null == head;
    }
    
    public EmployeeNode removeNode(){
        EmployeeNode currentNode = head;
        head = currentNode.getNext();
        size--;
        return currentNode;
    }
}
