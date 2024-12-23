package Set;

import java.util.LinkedHashSet;

public class linkedhashset {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer>x=new LinkedHashSet<Integer>();
		x.add(10);
		x.add(20);
		x.add(30);
		x.add(null);
		
		//one null value contain
		System.out.println(x);
	}
}
