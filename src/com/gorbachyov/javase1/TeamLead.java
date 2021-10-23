package com.gorbachyov.javase1;

public class TeamLead extends Employee implements Manager {
    private String role;
    private int level;


    public TeamLead(String role, int level) {
        this.role = role;
        this.level = level;
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


    //<editor-fold desc="get and set methods">
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    //</editor-fold>
    @Override
    public String toString() {
        return "TeamLead{" +
                "role='" + role + '\'' +
                ", level=" + level +
                '}';
    }


}
