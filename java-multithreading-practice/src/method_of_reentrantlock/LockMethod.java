package method_of_reentrantlock;

import java.util.concurrent.locks.ReentrantLock;

public class LockMethod {
    public static void main(String[] args) {
        ReentrantLock reentrantLock = new ReentrantLock();

        // Acquire the lock
        // if lock is busy ---> then thread waits
        reentrantLock.lock();

        try {
            System.out.println("Lock Acquired..");
        } finally {
            // release the lock
            reentrantLock.unlock();
        }
    }

}
