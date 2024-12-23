package Java8features;

import java.util.Arrays;

public class removeduplicateelement {
	
	public static void main(String[] args) {
		
	
	int[] array = {5, 2, 8, 1, 6, 3, 5, 2, 8}; // Example array with duplicates
    // Removing duplicates using Stream API
    int[] distinctArray = Arrays.stream(array).distinct().toArray();
    // Printing the array without duplicates
    System.out.println("Array without duplicates: " + Arrays.toString(distinctArray));
}
}
