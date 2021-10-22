package com.gorbachyov.javase1;

public class TeamLead extends Employee implements Manager {
    private String name;
    private int id;

    public TeamLead(String name, int id) {
        this.name = name;
        this.id = id;
    }

    private void teamLeadMethod() {
        System.out.println("TeamLead doing something");
    }

    @Override
    public void manage() {
        System.out.println("");
    }

    @Override
    public void work() {
        System.out.println("teamLead");
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
        return "TeamLead{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }


}
