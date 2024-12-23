package Java8features;

import java.util.Arrays;
import java.util.List;

public class minmax {

	public static void main(String[] args) {
		
		List<Integer>l=Arrays.asList(9,8,7,6,5,4);
		long ll= l.stream().max((x,y)->x.compareTo(y)).get();
		System.out.println(ll);
		
		List<Integer>t=Arrays.asList(9,8,7,6,5,4);
		long tt= t.stream().min((x,y)->x.compareTo(y)).get();
		System.out.println(tt);
	}
}
