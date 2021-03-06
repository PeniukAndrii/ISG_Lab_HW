package MultiThreadSecondTask;

public enum CoffeeReceipt {
    AMERICANO(5,10,5),
    ESPRESSO(10,1,5),
    DOUBLE_ESPRESSO(10,2,10);

    private int waterTank;
    private int milkTank;
    private int coffeeTank;

    CoffeeReceipt(int waterTank, int milkTank, int coffeeTank) {
        this.waterTank = waterTank;
        this.milkTank = milkTank;
        this.coffeeTank = coffeeTank;
    }

    public int getWaterTank() {
        return waterTank;
    }

    public void setWaterTank(int waterTank) {
        this.waterTank = waterTank;
    }

    public int getMilkTank() {
        return milkTank;
    }

    public void setMilkTank(int milkTank) {
        this.milkTank = milkTank;
    }

    public int getCoffeeTank() {
        return coffeeTank;
    }

    public void setCoffeeTank(int coffeeTank) {
        this.coffeeTank = coffeeTank;
    }

    @Override
    public String toString() {
        return "CoffeeReceipt{" +
                "waterTank=" + waterTank +
                ", milkTank=" + milkTank +
                ", coffeeTank=" + coffeeTank +
                "} " + super.toString();
    }
}
