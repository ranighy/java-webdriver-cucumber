package support;

public class DonutShop {
    //THERE IS NO MAIN!!!!!
    public String name;
    public int squareFeet;
    private int leasePrice;

    //Constructor Method
    public DonutShop(String storeName, int squareFeet, int leasePrice) {
        this.name = storeName;
        this.squareFeet = squareFeet;
        this.leasePrice = leasePrice;
    }


    public String makeDonuts(String type) {
        return type + " Donut";
    }
}

