package Java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class eachCharacterHowmanyTimeOccure {

	public static void main(String[] args) {
		List<String>cha=Arrays.asList("rohan awale");
	    Map<Character,Long>ch=cha.stream().flatMapToInt(String::chars)//concert stream into intstream
	    		.mapToObj(c->(char)c)
	    		.collect(Collectors.groupingBy(Function.identity(),Collectors
	    				.counting()));
	    ch.forEach((character,count)->{
	    	if(count>1) {
	    		System.out.println(ch);
	    	}
	    });
	}
}
