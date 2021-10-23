package com.gorbachyov.javase1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection {
    public static void main(String[] args) {
        Set<Employee> employeesSet = new HashSet<>();
        employeesSet.add(new TeamLead("Technical Lead", 80));
        employeesSet.add(Developer.developerMethod("ул.Пушкина, д.Колотушкина", 999999));
        employeesSet.add(new Trainee("Стажёр", 3.0));
        for (Employee employee : employeesSet) {
            System.out.println(employee);
        }
        List<Employee> employeesList = new ArrayList<>(employeesSet);
        for (Employee employee : employeesList) {
            System.out.println(employee);
        }
    }
}







