package com.openbootcamp.session4;

public class SmartDevice {

    // Attributes common to all smart devices
    private String brand;
    private String model;
    private double price;

    // Constructor with all parameters
    public SmartDevice(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Getters and setters for the attributes
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
