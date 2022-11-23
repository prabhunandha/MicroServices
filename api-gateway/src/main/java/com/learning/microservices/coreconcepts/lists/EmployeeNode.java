package com.learning.microservices.coreconcepts.lists;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class EmployeeNode {
    private final Employee employee;
    private EmployeeNode next;
    private EmployeeNode previous;

    public String toString(){
        return employee.toString();
    }
}
