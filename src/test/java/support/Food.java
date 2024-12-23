package support;

public abstract class Food {
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    private int calories;
    private int weight;
    private String state;
   //no const because abstart classes never instantiated
//This method will be overriden laer
public void eatFood(){
    System.out.println("Consume food!!!");
}




}
