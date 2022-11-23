package com.learning.microservices.coreconcepts.lists;

public class EmployeeLinkedList {
    private EmployeeNode head;
    private int size;

    public void addToFront(Employee employee){
        EmployeeNode employeeNode =  new EmployeeNode(employee);
        employeeNode.setNext(head);
        head = employeeNode;
        size++;
    }

    public void printLL(){
        EmployeeNode currentNode = head;
        System.out.println("Head ->");
        while(currentNode != null) {
            System.out.print(currentNode);
            System.out.println(" -> ");
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
