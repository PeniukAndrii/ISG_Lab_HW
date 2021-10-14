package MultiThreadSecondTask;

public class User extends Thread{
    private String firstName;
    private CoffeeReceipt coffeeReceipt;
    private volatile CoffeeMachine coffeeMachine;

    public User() {
    }

    public User(String firstName, CoffeeReceipt coffeeReceipt, CoffeeMachine coffeeMachine) {
        this.firstName = firstName;
        this.coffeeReceipt = coffeeReceipt;
        this.coffeeMachine = coffeeMachine;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public CoffeeReceipt getCoffeeReceipt() {
        return coffeeReceipt;
    }

    public void setCoffeeReceipt(CoffeeReceipt coffeeReceipt) {
        this.coffeeReceipt = coffeeReceipt;
    }

    public CoffeeMachine getCoffeeMachine() {
        return coffeeMachine;
    }

    public void setCoffeeMachine(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void run() {
        coffeeMachine.makeCoffee(coffeeReceipt, firstName);
    }
}
