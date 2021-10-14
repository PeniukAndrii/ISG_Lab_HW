package MultiThreadSecondTask;

public class CoffeeMachine {
    private int water = 50;
    private int coffee = 45;
    private int milk = 45;

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getCoffee() {
        return coffee;
    }

    public void setCoffee(int coffee) {
        this.coffee = coffee;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CoffeeMachine that = (CoffeeMachine) o;

        if (water != that.water) return false;
        if (coffee != that.coffee) return false;
        return milk == that.milk;
    }

    @Override
    public int hashCode() {
        int result = water;
        result = 31 * result + coffee;
        result = 31 * result + milk;
        return result;
    }

    public void makeCoffee(CoffeeReceipt coffeeReceipt, String firstName){
        if(coffee - coffeeReceipt.getCoffeeTank() < 0 || milk - coffeeReceipt.getMilkTank() < 0 || water - coffeeReceipt.getWaterTank() < 0){
            System.out.println("Out of ingredients. " + firstName + " doesn't receive coffee");
        }
        else {
            coffee -= coffeeReceipt.getCoffeeTank();
            milk -= coffeeReceipt.getMilkTank();
            water -= coffeeReceipt.getWaterTank();
            System.out.println(firstName + " gets coffee");
        }
    }

    public void calculateSpendingIngredient(CoffeeMachine coffeeMachine){
        System.out.println("Затрачено води- " + (50-coffeeMachine.getWater()));
        System.out.println("Затрачено кави- " + (49-coffeeMachine.getCoffee()));
        System.out.println("Затрачено молока- " + (49-coffeeMachine.getMilk()));
    }

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "water=" + water +
                ", coffee=" + coffee +
                ", milk=" + milk +
                '}';
    }
}
