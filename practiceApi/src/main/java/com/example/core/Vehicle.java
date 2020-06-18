package com.example.core;

@FunctionalInterface
public interface Vehicle {
    public int getMileage();
    default int getWheels() {
        return 4;
    }

    default int getDoors() {
        return 5;
    }

}
