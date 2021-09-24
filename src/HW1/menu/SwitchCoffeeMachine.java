package HW1.menu;

import HW1.coffeMachines.BossCoffeeMachine;
import HW1.coffeMachines.CoffeeMachine;
import HW1.coffeMachines.LgCoffeeMachine;

import java.util.Scanner;

public final class SwitchCoffeeMachine {
    public static void switchCoffeeMachine() throws InterruptedException {
        Scanner in = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new BossCoffeeMachine("FT-3000");
        LgCoffeeMachine coffeeMachine2 = new LgCoffeeMachine("LG-Coffee-3009");
        boolean x = true;
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
                    x = false;
                    System.out.println("Turn off");
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }while (x!=false);
    }
}
