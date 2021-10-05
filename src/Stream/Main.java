package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(20,"Oleg"));
        users.add(new User(34,"Roman"));
        users.add(new User(40,"Igor"));
        users.add(new User(15,"Stepan"));
        users.add(new User(19,"Andrii"));
        users.add(new User(21,"Olya"));
        users.add(new User(35,"Vira"));
        users.add(new User(18,"Vova"));
        users.add(new User(27,"Danya"));
        users.add(new User(10,"Maks"));
        users.add(new User(49,"Sergii"));

        List<User> stream = users.stream()
                .filter((a) -> a.getAge() < 30)
                .sorted(Comparator.comparing(User::getName))
                .collect(Collectors.toList());
        System.out.println(stream);
    }
}
