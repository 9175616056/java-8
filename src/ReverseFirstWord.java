import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

//public class Test {
//	
//	
//
//	public static void main(String[] args) {
//
//		String s="rohan_awale_but";
//		Map<Character,Long>ss=s.chars()
//				.mapToObj(e->(char)e)
//				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
//		        .entrySet()
//		        .stream()
//		        .filter(entry->entry.getValue()>1)
//		        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
//		ss.forEach ((character,count)-> {
//			System.out.println(character+" :"+count);
//		});
//}
//}

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseFirstWord {
    public static void main(String[] args) {
//    	the task is to reverse the order of the words in the given string. 
//    	input:: Today is a holiday
//    	output:: holiday a is Today
    	
    	String str="Today is a holiday";
    	String output=reversewords(str);
    	System.out.println(output);
    }
    public static String reversewords(String input) {
    	
    	List<String>words=Arrays.asList(input.split(" "));
    	
    	Collections.reverse(words);
    	
    	return words.stream()
    			.collect(Collectors.joining(" "));
    }  
}
