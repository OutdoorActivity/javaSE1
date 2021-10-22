package com.gorbachyov.javase1;

public class Developer extends Employee {
    private String name;
    private int id;

    private Developer(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void work() {
        System.out.println("dev working...");
    }

    public static Developer developerMethod(String name, int id) {
        return new Developer(name, id);
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


}
