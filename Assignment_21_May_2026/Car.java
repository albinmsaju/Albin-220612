package Assignment_21_May_2026;

// File: Car.java
public class Car {
    // Fields
    private String brand;
    private String model;
    private double price;

    // Constructor
    public Car(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to start the car
    public void startCar() {
        System.out.println(brand + " " + model + " is starting...");
    }

    // Method to stop the car
    public void stopCar() {
        System.out.println(brand + " " + model + " is stopping...");
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Car Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating a Car object
        Car car1 = new Car("Toyota", "Innova", 15000);

        // Display details
        car1.displayDetails();

        // Start and stop the car
        car1.startCar();
        car1.stopCar();
    }
}
