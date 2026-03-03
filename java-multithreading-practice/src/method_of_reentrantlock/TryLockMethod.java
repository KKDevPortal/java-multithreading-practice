package method_of_reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class TryLockMethod {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();


        // attempting to acquire lock immediately
            // if available --> true
            // if not --> false
            // does not wait and Avoid blocking threads.
        if(reentrantLock.tryLock()){
            try {
                System.out.println("Got the lock");
            } finally {
                reentrantLock.unlock();
            }
        } else {
            System.out.println("Could not get the lock");
        }
    }
}
