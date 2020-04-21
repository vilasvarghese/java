import java.util.concurrent.locks.*;

class ReentrantLockExample {

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    Lock lockObject1 = new ReentrantLock();
    Lock lockObject2 = new ReentrantLock();

    public boolean transferWithSyncBlock(Account source, Account destination, int amount) {
        //Replacement for the synchronized block we did last week
        //Instead of synchronized(lockObj) we do lock.lock();
        synchronized (lock1) {
            synchronized (lock2) {
                destination.setBalance(destination.getBalance() + amount);
                source.setBalance(source.getBalance() - amount);
            }
        }
        return true;
    }

    public boolean depositWithSyncBlock(Account source, Account destination, int amount) {
        //Replacement for the synchronized block we did last week
        //Instead of synchronized(lockObj) we do lock.lock();
        synchronized (lock2) {
            synchronized (lock1) {
                destination.setBalance(destination.getBalance() + amount);
                source.setBalance(source.getBalance() - amount);
            }
        }
        return true;
    }

    public boolean transfer(Account source, Account destination, int amount) {

        //Replacement for the synchronized block we did last week
        //Instead of synchronized(lockObj) we do lock.lock();
        try {
            if (lockObject1.tryLock() && (lockObject2.tryLock())) {
                destination.setBalance(destination.getBalance() + amount);
                source.setBalance(source.getBalance() - amount);
            } else {
                lockObject1.unlock();
                return false;
            }
        } finally {
            lockObject1.unlock();
            lockObject2.unlock();
        }
        return true;
    }
    public boolean deposit(Account source, Account destination, int amount){

        //Replacement for the synchronized block we did last week
        //Instead of synchronized(lockObj) we do lock.lock();
        try {
            if (lockObject1.tryLock() && (lockObject2.tryLock())) {
                destination.setBalance(destination.getBalance() + amount);
                source.setBalance(source.getBalance() - amount);
            } else {
                lockObject1.unlock();
                return false;
            }
        } finally {
            lockObject1.unlock();
            lockObject2.unlock();
        }
        return true;
    }


    public static void main(String args[]){
        Account source = new Account("100", "Abin", 1000);
        Account destination = new Account("100", "Alan", 2000);
        ReentrantLockExample lockExample = new ReentrantLockExample();
        lockExample.deposit(source, destination, 100);
        lockExample.transfer(destination,source, 50);
    }
}
