package com.learning.microservices.coreconcepts.lists;

public class EmployeeDoubleLL {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size;

    public int getSize(){
        return size;
    }

    public void addingToFront(Employee employee){
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setNext(head);

        if(head == null || isEmpty()){
            tail  = employeeNode;
        } else {
            head.setPrevious(employeeNode);
        }
        head = employeeNode;
        size++;
    }

    public void addingToEnd(Employee employee){
        EmployeeNode employeeNode = new EmployeeNode(employee);
        employeeNode.setPrevious(tail);

        if(isEmpty() || tail == null){
            head = employeeNode;
        } else {
            tail.setNext(employeeNode);
        }
        tail = employeeNode;
        size++;
    }

    public void printLL(){
        EmployeeNode currentNode = head;
        System.out.println("Head ->");
        while(null != currentNode){
            System.out.print(currentNode);
            System.out.println("<=>");
            currentNode = currentNode.getNext();
        }
        System.out.println("null");
    }
    private boolean isEmpty() {
        return null == head || null == tail || 0 == size;
    }

    public EmployeeNode removeFromFront(){
        if(isEmpty()) return null;
        EmployeeNode currentNode = head;
        if(getSize() == 1 || head.getNext() == null){
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = currentNode.getNext();
        size--;
        return currentNode;
    }


    public EmployeeNode removeFromTail(){
        if(isEmpty()) return null;
        EmployeeNode currentNode = tail;

        if(getSize() == 1 || null == tail.getPrevious()) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = currentNode.getPrevious();
        size--;
        return currentNode;
    }















}
