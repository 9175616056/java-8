package Java8features;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public class uniquenumberbetweentwostring {

	public static void main(String[] args) {
		
		 List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5);
	        List<Integer> list2 = Arrays.asList(4, 5, 6, 7, 8);

	  List<Integer> uniqueNumbers = Stream.concat(list1.stream(), list2.stream())//convert into single stream
	                .collect(Collectors.groupingBy(e -> e, Collectors.counting()))
	                                            .entrySet()
	                                            .stream()
	                                            .filter(e -> e.getValue() == 1)//filter out hte element that appears only once
	                                            .map(Map.Entry::getKey)
	                                            .collect(Collectors.toList());

	        System.out.println( uniqueNumbers);
	   
	}
}
