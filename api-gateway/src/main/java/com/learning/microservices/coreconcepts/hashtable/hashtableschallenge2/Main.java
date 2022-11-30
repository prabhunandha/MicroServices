package com.learning.microservices.coreconcepts.hashtable.hashtableschallenge2;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));

        HashMap<Integer,Employee> hashMap = new HashMap<>();
        List<Employee> remove = new ArrayList<>();
        ListIterator<Employee> iterator = employees.listIterator();

        while(iterator.hasNext()) {
            Employee employee = iterator.next();
            if(hashMap.containsKey(employee.getId())){
                remove.add(employee);
            } else {
                hashMap.put(employee.getId(), employee);
            }
        }


        for(Employee employee : remove){
            employees.remove(employee);
        }

        System.out.println("***********");
        for(Employee employee:employees){
            System.out.println(employee);
        }


    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
