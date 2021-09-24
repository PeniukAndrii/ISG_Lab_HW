package HW1.interfaces.coffe;


import HW1.enums.drinks.Drinks;
import HW1.coffeMachines.CoffeeMachine;
import HW1.menu.Menu;

import java.util.concurrent.TimeUnit;

public interface MakeCoffee {
    static void makeCoffee(CoffeeMachine coffeeMachine, Drinks drinks) throws InterruptedException {
        int localWaterTank = coffeeMachine.getWaterTank();
        int localCoffeeTank = coffeeMachine.getCoffeeTank();
        int localDrinkWaterTank = drinks.getWaterTank();
        int localDrinkCoffeeTank = drinks.getCoffeeTank();

        if(localWaterTank - localDrinkWaterTank < 0){
            System.out.println("Заповніть бак з водою");
            if(localCoffeeTank - localDrinkCoffeeTank < 0){
                System.out.println("Заповніть бак з кавою");
            }
        }
        else if(localCoffeeTank - localDrinkCoffeeTank < 0){
            System.out.println("Заповніть бак з кавою");
            if(localWaterTank-localDrinkWaterTank < 0){
                System.out.println("Заповніть бак з водою");
            }
        }
        else {
            coffeeMachine.setCoffeeTank(localCoffeeTank-localDrinkCoffeeTank);
            coffeeMachine.setWaterTank(localWaterTank - localDrinkWaterTank);
            System.out.println(drinks.getName() + " готова");
            TimeUnit.SECONDS.sleep(1);
        }
        Menu.menuInCoffeeMachine();
    }

    static void addWather(CoffeeMachine coffeeMachine){
        if(coffeeMachine.getWaterTank() < coffeeMachine.getWaterTankLimit()){
            coffeeMachine.setWaterTank(coffeeMachine.getWaterTankLimit());
            System.out.println("Бак з водою заповнений");
        }
        else {
            System.out.println("Бак з водою вже заповнений");
        }

    }

    static void addCoffee(CoffeeMachine coffeeMachine){
        if(coffeeMachine.getCoffeeTank() < coffeeMachine.getCoffeeTankLimit()){
            coffeeMachine.setCoffeeTank(coffeeMachine.getCoffeeTankLimit());
            System.out.println("Бак з кавою заповнений");
        }
        else{
            System.out.println("Бак з кавою вже заповнений");
        }
    }

}
