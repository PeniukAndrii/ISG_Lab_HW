package CoffeeMachine.menu;

import CoffeeMachine.coffeMachines.BossCoffeeMachine;
import CoffeeMachine.coffeMachines.CoffeeMachine;
import CoffeeMachine.coffeMachines.LgCoffeeMachine;

import java.util.Scanner;

public final class SwitchCoffeeMachine {
    public static void switchCoffeeMachine() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new BossCoffeeMachine("FT-3000");
        CoffeeMachine coffeeMachine2 = new LgCoffeeMachine("LG-Coffee-3009");
        boolean x = false;
        System.out.println("Chose coffee machine: \n" +
                "1.\"Boss\" \n" +
                "2.\"LG\" \n" +
                "0.\"Turn off\" \n");
        do{
            switch (in.nextInt()) {
                case 1:
                    MenuRealization.menuRealization(coffeeMachine);
                    break;
                case 2:
                    MenuRealization.menuRealization(coffeeMachine2);
                    break;
                case 0:
                    System.out.println("Turn off");
                    x = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (!x);
    }
}
