package MultiThreadSecondTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        ExecutorService es = Executors.newCachedThreadPool();
        es.execute(new User("Oksana",CoffeeReceipt.DOUBLE_ESPRESSO,coffeeMachine));
        es.execute(new User("Oleg",CoffeeReceipt.AMERICANO, coffeeMachine));
        es.execute(new User("Sergiy",CoffeeReceipt.DOUBLE_ESPRESSO, coffeeMachine));
        es.execute(new User("Andriy",CoffeeReceipt.ESPRESSO, coffeeMachine));
        es.execute(new User("Vova",CoffeeReceipt.AMERICANO, coffeeMachine));
        es.execute(new User("Olga",CoffeeReceipt.DOUBLE_ESPRESSO,coffeeMachine));
        es.execute(new User("Vira",CoffeeReceipt.AMERICANO, coffeeMachine));
        es.execute(new User("Nadya",CoffeeReceipt.AMERICANO, coffeeMachine));
        es.shutdown();
        try {
            if (!es.awaitTermination(60, TimeUnit.SECONDS)) {
                es.shutdownNow();
            }
        } catch (InterruptedException ex) {
            es.shutdownNow();
            Thread.currentThread().interrupt();
        }
        coffeeMachine.calculateSpendingIngredient(coffeeMachine);
        System.out.println("Залишилось- " + coffeeMachine);
    }
}
