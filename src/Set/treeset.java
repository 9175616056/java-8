package Set;

import java.util.TreeSet;

public class treeset {

	public static void main(String[] args) {
		
		TreeSet<Integer>x=new TreeSet<Integer>();
		x.add(10);
		x.add(2);
		x.add(29);
		x.add(29);
		
		 //doesnot contain null value
		System.out.println(x);
	}
}
