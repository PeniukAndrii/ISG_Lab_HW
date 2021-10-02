package HW2.CustomExeption;

public class Main{
    public static void main(String[] args) {
        int counter = 0;
        try {
            callCook(counter);
            counter++;
            callCook(counter);
            counter++;
            callCook(counter);
        } catch (CookException e) {
            e.printStackTrace();
        }
    }
    public static void callCook(int counter) throws CookException {
        if(counter<2){
            System.out.println("Cook is cooking...");
        }
        else {
            throw new CookException("Cook is buzy");
        }
    }
}

