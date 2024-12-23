package Java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class parallelstream {

	public static void main(String[] args) {
		
//		List<String>list=Arrays.asList("a","s","d","f","g","h","j","k","l");
//		list.parallelStream(System.out.println()); 
		
		 List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

	        // Using parallel stream
	        int sum = numbers.parallelStream()
	                         .mapToInt(Integer::intValue)
	                         .sum();

	        System.out.println("Sum: " + sum);
	}
}
