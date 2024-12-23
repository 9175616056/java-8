package Map;

import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		
		TreeMap<Integer,String>x= new TreeMap<Integer,String>();
		x.put(1,"rohan");
		x.put(1, "awale");
		x.put(19,"buddhabhagwan");
		x.put(2122,"ranjana");
		x.put(25, "divyani");
		x.put(1111, "awale");
		x.put(2, null);
		x.put(3, "h");
		x.put(7, null);//multiple null
		
		System.out.println(x);
	}
}
