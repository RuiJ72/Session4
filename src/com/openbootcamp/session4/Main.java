package com.openbootcamp.session4;

public class Main {

    public static void main(String[] args) {

        // Create a SmartPhone object
        SmartPhone phone = new SmartPhone("Apple", "iPhone 14", 999.99, "iOS", 256);

        // Print the values of the phone object
        System.out.println("SmartPhone:");
        System.out.println("Brand: " + phone.getBrand());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Price: $" + phone.getPrice());
        System.out.println("Operating System: " + phone.getOperatingSystem());
        System.out.println("Storage Capacity: " + phone.getStorageCapacity() + "GB");

        // Create a SmartWatch object
        SmartWatch watch = new SmartWatch("Apple", "Watch Series 7", 399.99, true, true);

        // Print the values of the watch object
        System.out.println("\nSmartWatch:");
        System.out.println("Brand: " + watch.getBrand());
        System.out.println("Model: " + watch.getModel());
        System.out.println("Price: $" + watch.getPrice());
        System.out.println("Has GPS: " + (watch.isHasGPS() ? "Yes" : "No"));
        System.out.println("Has Heart Rate Monitor: " + (watch.isHasHeartRateMonitor() ? "Yes" : "No"));
    }
}

