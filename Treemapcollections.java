package Mapinterface;
import java.util.*;
public class Treemapcollections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(4,"mahi");    
	      map.put(5,"sai");    
	      map.put(6,"tommy");       
	      
	      System.out.println("The elements of TreeMap are ");  
	      for(Map.Entry l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}




	


