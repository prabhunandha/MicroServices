package com.learning.microservices.coreconcepts.lists;


import lombok.*;

@AllArgsConstructor
@EqualsAndHashCode
@Data
public class Employee {

    private String firstName;
    private String lastName;
    private int id;

//    @Override
//    public String toString() {
//        return "Employee{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", id=" + id +
//                '}';
//    }
}

