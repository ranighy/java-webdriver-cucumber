package support;

public class CarAdvanced {
    public int newMileage;
    public int newFuelLevel;
    public int fuelLevel;
    public int existedMileage;
    private String make;
    private String model;
    public int mpg;
    public int fuelUpLevel;
    private int fuelConsumed;


    public CarAdvanced(int fuelLevel, int existedMileage, String make, String model, int mpg) {
        this.fuelLevel = fuelLevel;
        this.existedMileage = existedMileage;
        this.make = make;
        this.model = model;
        this.mpg = mpg;
    }

    //Method Drive
    public int drive(int newDriveDistance, int fuelLevel) {
        if (fuelLevel != 0) {
            newMileage = existedMileage + newDriveDistance;
            fuelConsumed = newDriveDistance / mpg;
            newFuelLevel = fuelLevel - fuelConsumed;
            return newMileage;
        } else {
            System.out.println("Can't Drive, no fuel!");
            return existedMileage;
        }
    }

    //Method Fuel Up
    public int fuelUp(int fuelUpAmount) {
        return fuelUpLevel = newFuelLevel + fuelUpAmount;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public static void main(String[] args) {

        CarAdvanced carAdvanced = new CarAdvanced(22, 10, "kia", "soul", 50);

        carAdvanced.drive(50, 20);
        System.out.println("driving  " + carAdvanced.getMake() + " " + carAdvanced.getModel() + " " + "for 50 miles");
        System.out.println("existed mileage " + carAdvanced.existedMileage + " + 50 = " + carAdvanced.newMileage + "miles");

    }

}