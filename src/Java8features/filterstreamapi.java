 package Java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class filterstreamapi {

	public static void main(String[] args) {
		
		List<Integer> l1 = Arrays.asList(2,3,4,5);
		//even no//List<Integer> l2 = l1.stream().filter(x->x%2==0).collect(Collectors.toList());
		//OR
		//odd no
		List<Integer>l2= l1.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(l2);
	}
}
