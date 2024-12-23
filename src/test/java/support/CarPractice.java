package support;

public class CarPractice {
    private int distance;
    private int fuelLevel;
    private int mpg = 25;// car gives 25 miles per gallon

    public void drive(int miles){
        if(fuelLevel>0){
            distance += miles;
            fuelLevel = fuelLevel - miles/mpg;
            System.out.println("You drove " + miles + " miles. Total distance: " + distance + " miles. Fuel level: " + fuelLevel);
        } else {
            System.out.println("No fuel to drive!"); // Inform the user that there is no fuel to drive
        }
    }
}




