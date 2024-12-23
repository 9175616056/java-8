import java.util.ArrayList;
import java.util.Collections;

import List.Arraylist;

public class comparable {

	public static void main(String[] args) {
		
		ArrayList<comparables>l=new ArrayList<>();
		
		l.add(new comparables("rohan","948",15));
		l.add(new comparables("rohit","144",13));
		l.add(new comparables("roshan","328",14));
		
		System.out.println(l);
		Collections.sort(l);
		System.out.println(l);
		
	}
}
 