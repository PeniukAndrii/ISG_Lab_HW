package MultiThreadSecondTask;

public class Main {
    public static void main(String[] args) {
        CoffeeMachine coffeeMachine = new CoffeeMachine(50,50,50);
        Thread thread = new Thread(new User("Oksana",CoffeeReceipt.DOUBLE_ESPRESSO,coffeeMachine));
        Thread thread2 = new Thread(new User("Oleg",CoffeeReceipt.AMERICANO, coffeeMachine));
        Thread thread3 = new Thread(new User("Sergiy",CoffeeReceipt.DOUBLE_ESPRESSO, coffeeMachine));
        Thread thread4 = new Thread(new User("Andriy",CoffeeReceipt.ESPRESSO, coffeeMachine));
        Thread thread5 = new Thread(new User("Vova",CoffeeReceipt.AMERICANO, coffeeMachine));
        Thread thread6 = new Thread(new User("Olga",CoffeeReceipt.DOUBLE_ESPRESSO,coffeeMachine));
        Thread thread7 = new Thread(new User("Vira",CoffeeReceipt.AMERICANO, coffeeMachine));
        Thread thread8 = new Thread(new User("Nadya",CoffeeReceipt.AMERICANO, coffeeMachine));
    }
}
