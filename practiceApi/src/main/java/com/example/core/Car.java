package com.example.core;

public class Car {
    public Car(Brand brand, String model, String modelYear, int cost) {
        this.brand = brand;
        this.model = model;
        this.modelYear = modelYear;
        this.cost = cost;
    }

    private Brand brand;
    private String model;
    private String modelYear;
    private int cost;

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand=" + brand +
                ", model='" + model + '\'' +
                ", modelYear='" + modelYear + '\'' +
                ", cost=" + cost +
                '}';
    }
}
