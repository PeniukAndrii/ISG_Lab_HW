package MultiThread;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new MainThread();
    }
}

class MainThread extends Thread {
    private static int count = 1;

    public MainThread() throws InterruptedException {
        start();
    }

    @Override
    public void run() {
        int limit = 50;
        if(count< limit){
            count++;
            try {
                new MainThread().join();
            } catch (InterruptedException exception) {
                System.out.println(exception);
            }
        }
        System.out.println("Thread " + count-- + " " + "created");
    }
}
