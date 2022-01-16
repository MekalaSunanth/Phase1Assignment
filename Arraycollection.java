package collections;
import java.util.*;
public class Arraycollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list=new ArrayList<String>();
list.add("mahi");
list.add("shahee");
list.add("potti");
list.add("anu");

Iterator itr = list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}

	}

}
