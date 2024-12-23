package Map;

import java.util.HashMap;
import java.util.Iterator;


public class hashmap {

	public static void main(String[] args) {
		
		HashMap<Integer,String>x=new HashMap<Integer,String>();
		
		x.put(12,"rohan");
		x.put(2, "awale");
		x.put(3,"buddhabhagwan");
		x.put(19,"ranjana");
		x.put(null, "r");
		x.put(4, "awale");
		x.put(1, null);
		x.put(32, null);//multiple null
		x.put(null, null);
		System.out.println(x);
		Iterator itr= x.Iterator();
		while(itr.hasNext());
		System.out.println(itr.next());
	}
}
//Iterator<Integer> iterator = map.values().iterator();
//
//// Iterating through the values
//while (iterator.hasNext()) {
//    Integer value = iterator.next();
//    System.out.println("Value: " + value);
//}
