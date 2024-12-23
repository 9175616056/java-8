package Java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class square {
public static void main(String[] args) {
	List<Integer>l1= Arrays.asList(2,3,4,5);//for square
	List<Integer>l2= l1.stream().map(x->x*x).collect(Collectors.toList());
	System.out.println(l1);
	System.out.println(l2);
}
}
