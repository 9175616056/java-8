package Java8features;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class evenno {
public static void main(String[] args) {
	List<Integer>list1=Arrays.asList(1,12,7,8,12,14,16);//for even number
	
	List<Integer> s=list1.stream().filter(i->i%2==0).collect(Collectors.toList());
System.out.println(s);
}
}
