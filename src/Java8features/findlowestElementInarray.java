package Java8features;

import java.util.Arrays;
import java.util.OptionalInt;

public class findlowestElementInarray {

	
	    public static void main(String[] args) {
	        int[] array = {5, 3, 9, 1, 4};

	        OptionalInt min = Arrays.stream(array).min();
	       // OptionalInt max = Arrays.stream(array).max(); 
            System.out.println(min.getAsInt());
//	        if (min.isPresent()) {
//	            System.out.println("The minimum element is: " + min.getAsInt());
//	        } else {
//	            System.out.println("The array is empty.");
//	        }
	    }
	}

