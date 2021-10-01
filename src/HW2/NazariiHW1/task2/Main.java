package HW2.NazariiHW1.task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        users.add(new User(1,"Oleg"));
        users.add(new User(2,"Andrii"));
        users.add(new User(3,"Lina"));
        users.add(new User(4,"Vova"));
        users.add(new User(5,"Bodia"));
        users.add(new User(6,"Gaga"));
        users.add(new User(7,"Ledi"));
        users.add(new User(8,"Ira"));
        users.add(new User(9,"Giga"));
        users.add(new User(10,"Olya"));
        users.add(new User(11,"Nastya"));
        users.add(new User(12,"Vlad"));
        users.add(new User(13,"Roxolana"));
        users.add(new User(14,"Igor"));
        users.add(new User(15,"Oleg"));
        users.add(new User(16,"Tanya"));
        users.add(new User(17,"Katya"));
        users.add(new User(18,"Stepan"));
        users.add(new User(19,"Anton"));
        users.add(new User(20,"Roman"));
        users.add(new User(21,"Oksana"));

        MyGeneric<List<User>> userMyGeneric = new MyGeneric<>();
        userMyGeneric.takeFibonachi(users);
    }
}
