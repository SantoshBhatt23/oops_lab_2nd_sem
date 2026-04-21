
package ques2;

class Vehicle {

    String brand;
    int maxSpeedValue;
    String color;
    int yearOfManufacture;
    // Constructor for Vehicle
    Vehicle(String brand, int maxSpeedValue, String color, int yearOfManufacture) {
        this.brand = brand;
        this.maxSpeedValue = maxSpeedValue;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
    }

    public void displayBasicInfo() {
        System.out.println("--- " + brand + " Details ---");
        System.out.println("Year: " + yearOfManufacture);
        System.out.println("Color: " + color);
    }


    public void maxSpeed() {
        System.out.println("The maximum speed is " + maxSpeedValue + " km/h.");
    }
}

// Subclass 1: Car
class Car extends Vehicle {
    int numberOfDoors;


    Car(String brand, int maxSpeedValue, String color, int yearOfManufacture, int numberOfDoors) {
        super(brand, maxSpeedValue, color, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
    }


    public void maxSpeed() {
        System.out.println("This Car can reach a top speed of " + maxSpeedValue + " km/h on the highway.");
    }
}

// Subclass 2: Bicycle
class Bicycle extends Vehicle {
    boolean hasGears;

    public Bicycle(String brand, int maxSpeedValue, String color, int yearOfManufacture, boolean hasGears) {
        super(brand, maxSpeedValue, color, yearOfManufacture);
        this.hasGears = hasGears;
    }




    public void maxSpeed() {
        System.out.println("Depending on your legs, this Bicycle hits a max speed of " + maxSpeedValue + " km/h.");
    }
}

// Subclass 3: Scooter
class Scooter extends Vehicle {
    int engineCapacity;

    Scooter(String brand, int maxSpeedValue, String color, int yearOfManufacture, int engineCapacity) {
        super(brand, maxSpeedValue, color, yearOfManufacture);
        this.engineCapacity = engineCapacity;
    }


    public void maxSpeed() {
        System.out.println("This " + engineCapacity + "cc Scooter maxes out at " + maxSpeedValue + " km/h.");
    }
}


public class VehicleDemo {
    public static void main(String[] args) {

        Car myCar = new Car("Honda ", 220, "White", 2023, 4);
        Bicycle myBicycle = new Bicycle("Krafton", 45, "Grey", 2025, false);
        Scooter myScooter = new Scooter("Activa", 160, "Black", 2021, 125);

        //car:
        myCar.displayBasicInfo(); // Inherited from Vehicle
        myCar.maxSpeed();
        System.out.println();

        //bicycle:
        myBicycle.displayBasicInfo(); // Inherited from Vehicle
        myBicycle.maxSpeed();         // Overridden in Bicycle
        System.out.println();

        // Testing the Scooter
        myScooter.displayBasicInfo(); // Inherited from Vehicle
        myScooter.maxSpeed();         // Overridden in Scooter
    }
}