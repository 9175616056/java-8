package Java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class sumofnumber {

	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(9,8,7,6);
		Optional<Integer>l=list.stream().reduce((a,b)->a+b);
		System.out.println(l.get());
	}
}
