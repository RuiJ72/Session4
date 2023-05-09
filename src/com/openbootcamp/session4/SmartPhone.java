package com.openbootcamp.session4;

public class SmartPhone extends SmartDevice {
    // Attributes specific to smartphones
    private String operatingSystem;
    private int storageCapacity;

    // Constructor with all parameters
    public SmartPhone(String brand, String model, double price, String operatingSystem, int storageCapacity) {
        super(brand, model, price);
        this.operatingSystem = operatingSystem;
        this.storageCapacity = storageCapacity;
    }

    // Getters and setters for the attributes
    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }
}