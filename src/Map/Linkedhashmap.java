 package Map;

import java.util.LinkedHashMap;

public class Linkedhashmap {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String>x=new LinkedHashMap<Integer,String>();
		
		x.put(1, "rohan");
		x.put(22,"awlae");
		x.put(2, "roesfus");
		x.put(5, null);
		x.put(3, null);//multiple null value
		
		System.out.println(x);
	}
}
