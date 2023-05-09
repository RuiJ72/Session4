package com.openbootcamp.session4;

public class SmartWatch extends SmartDevice {
    // Attributes specific to smartwatches
    private boolean hasGPS;
    private boolean hasHeartRateMonitor;

    // Constructor with all parameters
    public SmartWatch(String brand, String model, double price, boolean hasGPS, boolean hasHeartRateMonitor) {
        super(brand, model, price);
        this.hasGPS = hasGPS;
        this.hasHeartRateMonitor = hasHeartRateMonitor;
    }

    // Getters and setters for the attributes
    public boolean isHasGPS() {
        return hasGPS;
    }

    public void setHasGPS(boolean hasGPS) {
        this.hasGPS = hasGPS;
    }

    public boolean isHasHeartRateMonitor() {
        return hasHeartRateMonitor;
    }

}
