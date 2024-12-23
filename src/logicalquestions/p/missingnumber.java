package logicalquestions.p;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class missingnumber {

	public static void main(String[] args) {
		
		 int[] array = {4, 3, 5, 10, 6, 2, 6, 8};
	        // Remove duplicates and find min and max
	        Set<Integer> uniqueNumbers = new TreeSet<>();
	        for (int num : array) {
	            uniqueNumbers.add(num);
	        }
	        int min = 2; // Given min
	        int max = 10; // Given max
	        // Find the missing numbers
	        Set<Integer> missingNumbers = new HashSet<>();
	        for (int i = min; i <= max; i++) {
	            if (!uniqueNumbers.contains(i)) {
	                missingNumbers.add(i);
	            }
	        }
	        // Output the result
	        System.out.println("Non-duplicate Array: " + uniqueNumbers);
	        System.out.println("Min: " + min);
	        System.out.println("Max: " + max);
	        System.out.println("Missing numbers: " + missingNumbers);
	}
}
