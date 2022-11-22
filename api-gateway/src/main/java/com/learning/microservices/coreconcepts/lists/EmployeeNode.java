package com.learning.microservices.coreconcepts.lists;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmployeeNode {
    private Employee employee;
    private EmployeeNode next;

    public String toString(){
        return employee.toString();
    }
}
