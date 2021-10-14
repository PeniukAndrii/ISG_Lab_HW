package MultiThreadSecondTask;

public class CoffeeMachine {
    private int water;
    private int coffee;
    private int milk;

    public CoffeeMachine(int water, int coffee, int milk) {
        this.water = water;
        this.coffee = coffee;
        this.milk = milk;
    }

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

    @Override
    public String toString() {
        return "CoffeeMachine{" +
                "water=" + water +
                ", coffee=" + coffee +
                ", milk=" + milk +
                '}';
    }
}
