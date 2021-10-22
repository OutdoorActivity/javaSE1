package com.gorbachyov.javase1;

public class Trainee extends Employee {
    private String name;
    private int id;

    public Trainee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void work() {
        System.out.println("trainee");
    }

    protected void traineeMethod() {
        System.out.println(name + "doing something");
    }


    //<editor-fold desc="get and set methods">
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
    //</editor-fold>

    @Override
    public String toString() {
        return "Trainee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


}
