package logicalquestions.p;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Randomnumberr {

	public static void main(String[] args) {
		
		 List<Integer> randomNumbers = new ArrayList<>();

	        // Generate 5 random numbers and add them to the list
	        Random rand = new Random();
	        for (int i = 0; i < 5; i++) {
	            randomNumbers.add(rand.nextInt(100)); // Generating random numbers between 0 and 99
	        }

	        // Print each random number using a foreach loop
	        for (int number : randomNumbers) {
	            System.out.println(number);		
	        }	}
}
