package hello;


	import java.util.*;

	public class Queuefile
	{
	public static void main(String[] args) 
	{
	        		Queue<String> locationsQueue = new LinkedList<>();
	locationsQueue.add("Pune");
	        		locationsQueue.add("Bengaluru");
	        		locationsQueue.add("Tirupathi");
	        		locationsQueue.add("chennai");
	        		locationsQueue.add("Hyderabad");
	System.out.println("Queue is : " + locationsQueue);
	        		System.out.println("Head of Queue : " + locationsQueue.peek());
	        		locationsQueue.remove();
	        		System.out.println("After removing Head of Queue : " + locationsQueue);
	        		System.out.println("Size of Queue : " + locationsQueue.size());
	    	}
	}

