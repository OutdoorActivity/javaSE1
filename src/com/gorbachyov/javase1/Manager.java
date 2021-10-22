package com.gorbachyov.javase1;

public interface Manager {
    void manage();

    default void managerMethod() {
        System.out.println("manage");
    }
}
