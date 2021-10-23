package com.gorbachyov.javase1;

public class Developer extends Employee {
    private String address;
    private int salary;


    private Developer(String address, int salary) {
        this.address = address;
        this.salary = salary;
    }


    @Override
    public void work() {
        System.out.println("dev working...");
    }

    public static Developer developerMethod(String address, int salary) {
        return new Developer(address, salary);
    }

    //<editor-fold desc="get and set methods">
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    //</editor-fold>
    @Override
    public String toString() {
        return "Developer{" +
                "address='" + address + '\'' +
                ", salary=" + salary +
                '}';
    }


}
