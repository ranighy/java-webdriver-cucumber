package support;

import support.CarUpdate;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.drive(20);



        CarUpdate car2 = new CarUpdate(1, "BMW", "Sedan"); // Create a new car
        car2.drive(50);

        // Print car details after driving
        System.out.println("First Car Information with travel details:");
        System.out.println("Car2 (" + car2.getMake() + " " + car2.getModel() + "):");
        System.out.println("Car2 distance now: " + car2.getDistance() + " miles.");
        System.out.println("Car2 fuelLevel now: " + car2.getFuelLevel() + " gallons.");
    }
}












