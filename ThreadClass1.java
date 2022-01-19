package thread;

public class ThreadClass1 implements Runnable{
	public static int myCount = 0;
    public ThreadClass1(){
         
    }
    public void run() {
        while(ThreadClass1.myCount <= 7){
            try{
                System.out.println("Mahii: "+(++ThreadClass1.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting of Nick Name...");
        ThreadClass1 mrt = new ThreadClass1();
        Thread t = new Thread(mrt);
        t.start();
        while(ThreadClass1.myCount <= 7){
            try{
                System.out.println("Dhoni: "+(++ThreadClass1.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Nick Name...");
    }

}
