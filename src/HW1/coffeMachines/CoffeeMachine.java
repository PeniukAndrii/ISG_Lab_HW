package HW1.coffeMachines;

public abstract class CoffeeMachine {
    private int waterTank;
    private int coffeeTank;

    public CoffeeMachine() {
    }

    public CoffeeMachine(int waterTank, int coffeeTank) {
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

    @Override
    public String toString() {
        return "waterTankLimit=" + " " + getWaterTankLimit() + " coffeeTankLimit-" + " " + getCoffeeTankLimit();
    }

    public void getInfoAboutTank(){
        System.out.println("WaterTank-" + " "  + waterTank + "\n" +
         "CoffeeTank-" + " " + coffeeTank );
    }


    public abstract int getWaterTankLimit();
    public abstract int getCoffeeTankLimit();
}
