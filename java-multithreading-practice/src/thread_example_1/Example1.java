package thread_example_1;

public class Example1 {
    public static void main(String[] args) {
        SayHello sayHello = new SayHello();
        SayBye sayBye = new SayBye();

        Thread t1 = new Thread(sayHello);
        t1.start();

        Thread t2 = new Thread(sayBye);
        t2.start();
    }
}

