package com.gorbachyov.javase1;

public abstract class Employee {
    public static void main(String[] args) {
        var employee = new Employee() {
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
        employee.employeeAnonymousMethod();
        employee.work();
    }

    private String name;
    private int id;



    public abstract void work();

    public String employeeMethod() {
        return "this is employee method";
    }

    //<editor-fold desc="get and set methods">
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
    //</editor-fold>
}
