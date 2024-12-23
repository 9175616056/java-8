package Java8features;

import java.util.Arrays;

public class countthenumberofwords {

	public static void main(String[] args) {
		String str = "count the number of words in a string using stream api";

        long wordCount = Arrays.stream(str.split(" "))
                .count();

        
        System.out.println(str);
        System.out.println("Number of words: " + wordCount);
	
	}
}
