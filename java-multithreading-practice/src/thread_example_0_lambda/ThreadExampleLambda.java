package thread_example_0_lambda;

public class ThreadExampleLambda {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        // Example thread with lambda expression
        Thread t =  new Thread(() -> {
            System.out.println("New thread with lambda expression");
            System.out.println(Thread.currentThread().getName());
        });
        t.start();

    }
}