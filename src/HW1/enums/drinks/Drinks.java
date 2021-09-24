package HW1.enums.drinks;

public enum Drinks {
    AMERICANO(15,10),
    ESPRESSO(10,5),
    DOUBLE_ESPRESSO(200,200);

    private int waterTank;
    private int coffeeTank;

    Drinks(int waterTank, int coffeeTank) {
        this.waterTank = waterTank;
        this.coffeeTank = coffeeTank;
    }

    public int getWaterTank() {
        return waterTank;
    }

    public void setWaterTank(int waterTank) {
        this.waterTank = waterTank;
    }

    public int getCoffeeTank() {
        return coffeeTank;
    }

    public void setCoffeeTank(int coffeeTank) {
        this.coffeeTank = coffeeTank;
    }

    public String getName(){
        return super.toString();
    }

    @Override
    public String toString() {
        return "Drinks{" +
                "waterTank=" + waterTank +
                ", coffeeTank=" + coffeeTank +
                "} " + super.toString();
    }
}
