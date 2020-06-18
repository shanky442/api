package com.example.core;

public class Driver {

    Driver(String id) {
        this.id = id;
    }

    String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "id='" + id + '\'' +
                '}';
    }
}
