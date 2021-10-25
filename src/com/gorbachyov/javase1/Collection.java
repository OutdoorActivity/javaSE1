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


        var e = new Employee() {
            private String email;

            @Override
            public void work() {
                System.out.println("anonymous work...");
            }

            public void employeeAnonymousMethod() {
                System.out.println("do some employee stuff...");
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }
        };
        e.employeeAnonymousMethod();
        e.work();
        e.setName("Лаврентий");

        List<Employee> employeesList2 = new ArrayList<>();
        employeesList2.add(e);
        employeesList2.add(new TeamLead("Сергей"));
        employeesList2.add(new Developer("Евгений"));
        employeesList2.add(new Trainee("Георгий"));
        employeesList2.add(new TeamLead("Павел"));
        employeesList2.add(new Developer("Роман"));
        employeesList2.add(new Trainee("Фёдор"));

        List<Employee> employeeList3 = employeesList2.stream().filter(employee -> employee.getName().contains("рент")).collect(Collectors.toList());
        System.out.println(employeeList3);

        employeeList3.stream().map(Employee::getName).sorted(String::compareTo).forEach(System.out::println);
    }
}







