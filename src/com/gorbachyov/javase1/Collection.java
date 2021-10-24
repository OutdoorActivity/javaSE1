package com.gorbachyov.javase1;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

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
        List<Employee> employeesList2 = new ArrayList<>();
        employeesList2.add(new TeamLead("Б", 5));
        employeesList2.add(Developer.developerMethod("А", 2));
        employeesList2.add(new Trainee("С", 10));
        employeesList2.add(new TeamLead("В", 10));
        employeesList2.add(Developer.developerMethod("Г", 15));
        employeesList2.add(new Trainee("Д", 10));

        List<Employee> employeeList3 = employeesList2.stream().filter(employee -> employee instanceof TeamLead).collect(Collectors.toList());
        System.out.println(employeeList3);
        employeeList3.get(0).setName("Борис");
        employeeList3.get(1).setName("Аркадий");
        employeeList3.stream().map(Employee::getName).sorted(String::compareTo).forEach(System.out::println);
    }
}







