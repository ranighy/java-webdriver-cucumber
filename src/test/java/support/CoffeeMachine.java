package support;
//Inspired by the CafeX in SFO airport I would like you to create me a CoffeeMachine.
// This coffee will create three different drinks:
//  Coffee
//  Latte
//  Mocha
//  For both Latte and Mocha you can substitute regular milk with Oat or Soy milk.
//  The CoffeeMachine then will package your order.
//  You can clear or modify your order. Your order will then be returned as an ArrayList.

import java.util.ArrayList;
import java.util.HashMap;

public class CoffeeMachine {

   // ArrayList to store the order
   private ArrayList<String> order;

   // Constructor to initialize the ArrayList when a CoffeeMachine object is created
   public CoffeeMachine() {
      this.order = new ArrayList<>();
   }

   // Method to package and add the drink to the order
   public void packageOrder(String drink) {
      order.add(drink);
   }
   // Edit Order by the Name of the drink
   public void editOrder(String drink){
       order.remove(drink);
   }
   //Edit Order by the Index of the drink
    public void editOrder(int drink){
        order.remove(drink);
    }
    //Edit Order by the Index and replace with different drink
    public void editOrder(int drink,String replaceDrink){
        order.set(drink,replaceDrink);
    }


   // Methods to create different drinks
   public String makeCoffee(String size) {
      return size + " Coffee";
   }

   public String makeLatte(String size,String milk) {
      return size + " Latte with " + milk ;
   }
 public String makeLatte(String milk){
    return milk + " Latte";
 }


   public String makeMocha(String size) {
      return size + " Mocha";
   }

   // Method to get the current order
   public ArrayList<String> getOrder() {
      return order;
   }
    public void clearOrder(String drink) {
        order.clear();
    }

   // Main method to test the CoffeeMachine
   public static void main(String[] args) {

      // Creating a CoffeeMachine object
      CoffeeMachine cafeY = new CoffeeMachine();

      // Creating a drink and packaging it in the order
      String hella = cafeY.makeCoffee("Hella");
      cafeY.packageOrder(hella);

      // Printing the order
      System.out.println(cafeY.getOrder());
      String regularLatte = cafeY.makeLatte("Venti");
      String fencyLatte = cafeY.makeLatte("Venti","Oat milk");
      cafeY.packageOrder(fencyLatte);
      System.out.println(cafeY.getOrder());

       HashMap<Integer,CoffeeMachine>coffeeStore = new HashMap<>();
       coffeeStore.put(123,new CoffeeMachine());
       coffeeStore.put(1234,new CoffeeMachine());
       coffeeStore.put(12345,new CoffeeMachine());
       System.out.println(coffeeStore);
       System.out.println(coffeeStore.keySet());







   }
}

