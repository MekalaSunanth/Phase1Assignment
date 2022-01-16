package collections;
import java.util.*;
public class Hashcollection {
	public static void main(String args [] ) {
		
	HashSet<String> set=new HashSet <String>();
	
	set.add("Ravi");
	set.add("mahi");
	set.add("anil");
	set.add("dhoni");
	Iterator<String>itr=set.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());
	}
	
}
}