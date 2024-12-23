package support;

public class CarUpdate {

    private int distance = 0;
    private int fuelLevel;
    private int mpg = 25; // miles per gallon
    private String make;
    private String model;

    // Constructor
    public CarUpdate(int fuelLevel, String make, String model) {
        this.fuelLevel = fuelLevel;
        this.make = make;
        this.model = model;
    }

    public void drive(int miles) {
        // Print the current fuel level before driving
        System.out.println("Car2 fuel level before driving : " + fuelLevel + " gallons.");

        // Calculate fuel used and update distance and fuel level
        int fuelUsed = miles / mpg; // Calculate fuel used based on miles driven

        // Update distance
        distance += miles;

        // Update fuel level
        fuelLevel -= fuelUsed;

        // Print travel information and fuel level after driving
        System.out.println("You drove " + miles + " miles.");
        System.out.println("Your total distance is now: " + distance + " miles.");
        System.out.println("Fuel level after driving: " + fuelLevel + " gallons.");
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }
}
