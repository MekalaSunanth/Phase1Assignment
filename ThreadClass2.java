package thread;

public class ThreadClass2 {
    private static Object LOCK = new Object();
    public static void main(String args[]) throws InterruptedException
    {
        Thread.sleep(700);
        System.out.println("mother '" + Thread.currentThread().getName() + "' is woken after sleeping for 1 second");
        synchronized (LOCK) 
        {
            LOCK.wait(700);
            System.out.println("son '" + LOCK + "' is woken after" + " waiting for 1 second");
        }
    }

}
