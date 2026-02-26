package thread_example_1;

public class SayBye implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Bye " + i);
        }
    }
}
