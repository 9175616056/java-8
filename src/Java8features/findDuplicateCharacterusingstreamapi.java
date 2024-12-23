package Java8features;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class findDuplicateCharacterusingstreamapi {

	public static void main(String[] args) {
		
	
	 String input = "Java Programming";

     Map<Character, Long> duplicates = input.chars() // Convert the string to an IntStream of characters
         .mapToObj(c -> (char) c) // Convert the IntStream to a Stream<Character>
         .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())) // Group by character and count the occurrences
        . entrySet()//to get the set of key value pair
         .stream()//converts this set into a stream of Map.Entry objects for further processing.
         .filter(entry -> entry.getValue() > 1) // Filter to get only characters with more than one occurrence
         .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)); // Collect the result to a map of key value

     // Print the duplicates
     duplicates.forEach((character, count) -> {
         System.out.println(character + ": " + count);
     });
}}
