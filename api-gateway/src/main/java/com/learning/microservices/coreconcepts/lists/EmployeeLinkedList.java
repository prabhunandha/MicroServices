package com.learning.microservices.coreconcepts.lists;

public class EmployeeLinkedList {
    private EmployeeNode head;

    public void addToFront(Employee employee){
        EmployeeNode employeeNode =  new EmployeeNode(employee);
        employeeNode.setNext(employeeNode);
        head = employeeNode;
    }
}
