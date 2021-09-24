package HW1.menu;

import HW1.coffeMachines.CoffeeMachine;
import HW1.enums.drinks.Drinks;
import HW1.interfaces.coffe.MakeCoffee;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public final class MenuRealization implements MakeCoffee {
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
                    MakeCoffee.makeCoffee(coffeeMachine, Drinks.AMERICANO);
                    break;
                case 3:
                    MakeCoffee.makeCoffee(coffeeMachine, Drinks.ESPRESSO);
                    break;
                case 4:
                    MakeCoffee.makeCoffee(coffeeMachine, Drinks.DOUBLE_ESPRESSO);
                    break;
                case 5:
                    MakeCoffee.addWather(coffeeMachine);
                    Menu.menuInCoffeeMachine();
                    break;
                case 6:
                    MakeCoffee.addCoffee(coffeeMachine);
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
        }while (!y);
        System.exit(1);
    }
}
