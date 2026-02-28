package thread_example_2;

public class Mythread extends Thread {
    @Override
    public void run() {}

    public static void main(String[] args) {
        Mythread t1 = new Mythread();
        // check state of thread t1 : NEW
        System.out.println(t1.getState());

        t1.start();
        // check state of thread t1 : RUNNABLE
        System.out.println(t1.getState());


    }
}
