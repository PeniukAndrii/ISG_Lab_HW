package HW1.coffeMachines;

public class LgCoffeeMachine extends CoffeeMachine {
    private String info;
    private final int waterLimit = 200;
    private final int coffeeLimit = 100;

    public LgCoffeeMachine() {
    }

    public LgCoffeeMachine(String info) {
        this.info = info;
        super.setCoffeeTank(coffeeLimit);
        super.setWaterTank(waterLimit);
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    @Override
    public int getWaterTankLimit() {
        return waterLimit;
    }

    @Override
    public int getCoffeeTankLimit() {
        return coffeeLimit;
    }

    @Override
    public String toString() {
        return "LgCoffeeMachine: " + "model-" + " "
                + info + "\n" + "Info: " + super.toString();
    }
}
