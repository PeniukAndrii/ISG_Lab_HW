package HW1.coffeMachines;

public class BossCoffeeMachine extends CoffeeMachine {
    private String model;
    private final int waterLimit = 300;
    private final int coffeeLimit = 200;

    public BossCoffeeMachine() {
    }

    public BossCoffeeMachine(String model) {
        this.model = model;
        super.setCoffeeTank(coffeeLimit);
        super.setWaterTank(waterLimit);
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "BossCoffeeMachine: " + "model-" + " "
                + model + "\n" + "Info: " + super.toString();
    }

    @Override
    public int getWaterTankLimit() {
        return waterLimit;
    }

    @Override
    public int getCoffeeTankLimit() {
        return coffeeLimit;
    }
}
