package NazariiHW1.task2;

import java.util.List;

class MyGeneric<T> {
    T value;

    public MyGeneric() {
    }

    public MyGeneric(T value) {
        this.value = value;
    }

    void takeFibonachi(List<User> users){
        int one = 1;
        int two = 1;
        int res;
        while(one <= users.size()){
            res = one + two;
            System.out.println(users.get(one-1));
            one = two;
            two = res;
        }
    }
}
