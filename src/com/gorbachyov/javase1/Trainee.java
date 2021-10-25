package com.gorbachyov.javase1;

public class Trainee extends Employee {
    private String traineeField1;
    private double traineeField2;

    public Trainee(String name) {
        setName(name);
    }

    public Trainee(String traineeField1, double traineeField2) {
        this.traineeField1 = traineeField1;
        this.traineeField2 = traineeField2;
    }

    @Override
    public void work() {
        System.out.println("trainee");
    }

    protected void traineeMethod() {
        System.out.println("doing something");
    }


    //<editor-fold desc="get and set methods">
    public String getTraineeField1() {
        return traineeField1;
    }

    public void setTraineeField1(String traineeField1) {
        this.traineeField1 = traineeField1;
    }

    public double getTraineeField2() {
        return traineeField2;
    }

    public void setTraineeField2(double traineeField2) {
        this.traineeField2 = traineeField2;
    }
    //</editor-fold>

    @Override
    public String toString() {
        return "Trainee{" +
                "traineeField1='" + traineeField1 + '\'' +
                ", traineeField2=" + traineeField2 +
                '}';
    }
}
