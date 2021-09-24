package HW1.menu;

import HW1.coffeMachines.CoffeeMachine;
import HW1.enums.drinks.Drinks;
import HW1.interfaces.coffe.MadeCoffee;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public final class MenuRealization implements MadeCoffee {
    public static void menuRealization(CoffeeMachine coffeeMachine) throws InterruptedException {
        Scanner in = new Scanner(System.in);
        boolean y = false;
        Menu.menuInCoffeeMachine();
        do{
            switch (in.nextInt()){
                case 1:
                    coffeeMachine.getInfoAboutTank();
                    Menu.menuInCoffeeMachine();
                    break;
                case 2:
                    MadeCoffee.madeCoffee(coffeeMachine, Drinks.AMERICANO);
                    break;
                case 3:
                    MadeCoffee.madeCoffee(coffeeMachine, Drinks.ESPRESSO);
                    break;
                case 4:
                    MadeCoffee.madeCoffee(coffeeMachine, Drinks.DOUBLE_ESPRESSO);
                    break;
                case 5:
                    MadeCoffee.addWather(coffeeMachine);
                    Menu.menuInCoffeeMachine();
                    break;
                case 6:
                    MadeCoffee.addCoffee(coffeeMachine);
                    Menu.menuInCoffeeMachine();
                    break;
                case 7:
                    System.out.println(coffeeMachine);
                    Menu.menuInCoffeeMachine();
                    break;
                case 8:
                    System.out.println("Turn OFF");
                    y = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    Menu.menuInCoffeeMachine();
            }
            TimeUnit.SECONDS.sleep(2); // Для маленької паузи після виводу інфи.
        } while (y!=true);

    }
}
