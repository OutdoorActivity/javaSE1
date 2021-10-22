package com.gorbachyov.javase1;

public abstract class Employee {
    private String name;
    private int id;

    public abstract void work();

    public String employeeMethod() {
        return "this is employee method";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
