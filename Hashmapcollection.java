package Mapinterface;
import java.util.*;
public class Hashmapcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> m=new HashMap<Integer,String>();      
	      m.put(1,"shahee");    
	      m.put(2,"anil");    
	      m.put(3,"rowdy");   
	       
	      System.out.println("The elements of Hashmap are ");  
	      for(Map.Entry map:m.entrySet()){    
	       System.out.println(map.getKey()+" "+map.getValue());    
	      }
	}
}