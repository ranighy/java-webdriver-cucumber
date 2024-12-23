package support;

//The car class will have 2 attributes: fuelLevel and distance
//The car class will have two methods: drive() and fuelUp()
//drive() will accept distance as an int, adds the provided distance to the Car's existing distance, and print out Cars current distance.
//fuelUp() will accept fuel as an int, and increase the fuelLevel by the provided fuel, and print put the Cars current fuelLevel

//BONUS
//You can change and customize the Car class as long as the drive() and fuelUp do something to change the distance and fuelLevel attributes.
//fuelLevel can be measured as gallons, or as a generic 100.
//You can create a custom Miles Per Gallon converter if you wish.
//if the fuelLevel = 0 then drive  method should not work

public class Car {
    int fuelLevel;
    int distance;
    public void drive(int miles) {
        if (fuelLevel > 0) {
            distance += miles;
            fuelLevel -= 1;
            System.out.println("You drove " + miles + " miles. Total distance: " + distance + " miles. Fuel level: " + fuelLevel);
        } else {
            System.out.println("Car1:No fuel to drive!");
        }
    }
}