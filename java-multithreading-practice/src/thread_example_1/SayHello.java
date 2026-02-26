package thread_example_1;

public class SayHello extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println("Hello " + i);
        }
    }
}
