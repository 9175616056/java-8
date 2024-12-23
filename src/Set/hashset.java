package Set;

import java.util.HashSet;

public class hashset {

	public static void main(String[] args) {
		
		HashSet<Integer>x= new HashSet<Integer>();
		
		x.add(10);
		x.add(20);
		x.add(30);
		
		x.add(null);
		
		System.out.println(x);
	}
}
