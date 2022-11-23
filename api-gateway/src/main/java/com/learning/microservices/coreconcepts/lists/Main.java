package com.learning.microservices.coreconcepts.lists;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Jane", "Jones", 123));
        employeeList.add(new Employee("John", "Doe", 4567));
        employeeList.add(new Employee("Mary", "Smith", 22));
        employeeList.add(new Employee("Mike", "Wilson", 3245));


//        employeeList.forEach(System.out::println);

        //Overriding a specific element
        employeeList.set(1,new Employee("Prabhu", "Kadiam", 1));
        //Adding an element
        employeeList.add(1,new Employee("Prabhu", "Kadiam", 2));

        //Converting to array of custom type
        Employee[] empArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee e:empArray){
            System.out.println(e);
        }

        // Checking if the element is existing
        System.out.println(employeeList.contains(new Employee("Prabhu", "Kadiam", 2)));

        // Finding the index of an element
        System.out.println(employeeList.indexOf(new Employee("Jane", "Jones", 123)));

//        employeeList.forEach(System.out::println);

        Employee e1 = new Employee("Jane", "sdad", 123);
        Employee e2 = new Employee("sd", "Jonvbfes", 34535);
        Employee e3 = new Employee("dfdsf", "gdfg", 13);
        Employee e4 = new Employee("dfgerg", "dfbdfg", 567);

        EmployeeLinkedList employeeLinkedList = new EmployeeLinkedList();

        System.out.println("Is Empty? "+employeeLinkedList.isEmpty());

        employeeLinkedList.addToFront(e1);
        employeeLinkedList.addToFront(e2);
        employeeLinkedList.addToFront(e3);
        employeeLinkedList.addToFront(e4);

        System.out.println("Is Empty? "+employeeLinkedList.isEmpty());

        System.out.println("--------------------");
        employeeLinkedList.printLL();
        employeeLinkedList.removeNode();
        System.out.println("*************");
        employeeLinkedList.printLL();
        System.out.println("*************");

        EmployeeDoubleLinkedList employeeDoubleLinkedList = new EmployeeDoubleLinkedList();
        employeeDoubleLinkedList.addToFront(e1);
        employeeDoubleLinkedList.addToFront(e2);
        employeeDoubleLinkedList.addToFront(e3);
        employeeDoubleLinkedList.addToFront(e4);

        System.out.println(employeeDoubleLinkedList.getSize());
        employeeDoubleLinkedList.printLL();

        System.out.println("*************");

        Employee e5 = new Employee("tyuryrt", "dwqwqefbdfg", 5678);
        employeeDoubleLinkedList.addToEnd(e5);
        System.out.println(employeeDoubleLinkedList.getSize());
        employeeDoubleLinkedList.printLL();

    }
}
