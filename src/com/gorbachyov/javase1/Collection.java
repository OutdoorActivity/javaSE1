package com.gorbachyov.javase1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Collection {
    public static void main(String[] args) {
        Set<Employee> employeesSet = new HashSet<>();
        employeesSet.add(new TeamLead("Александр", 1));
        employeesSet.add(Developer.developerMethod("Евгений", 2));
        employeesSet.add(new Trainee("Николай", 3));
        for (Employee employee : employeesSet) {
            System.out.println(employee);
        }
        List<Set<Employee>> employeesList = new ArrayList<Set<Employee>>();
        employeesList.add(employeesSet);
        for (Set<Employee> employee : employeesList) {
            for (Employee employee1 : employee) {
                System.out.println(employee1);
            }
        }
    }

}





