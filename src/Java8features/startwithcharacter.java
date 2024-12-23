package Java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class startwithcharacter {
public static void main(String[] args) {
	
	List<String>list=Arrays.asList("rohan","rohit","awale");
	List<String>l=list.stream().filter(e->e.endsWith("t"))
			.collect(Collectors.toList());
	System.out.println(l);
}
}
