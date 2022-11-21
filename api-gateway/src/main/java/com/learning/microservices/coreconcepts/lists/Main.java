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



//        employeeList.forEach(System.out::println);

    }
}
