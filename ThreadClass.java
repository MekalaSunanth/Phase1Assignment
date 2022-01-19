package thread;

public class ThreadClass extends Thread {
	public void run()
 	{
  		System.out.println("covid thread started running..");
}
 	public static void main( String args[] )
 	{
  		ThreadClass tc = new  ThreadClass();
  		tc.start();
 	}
}


