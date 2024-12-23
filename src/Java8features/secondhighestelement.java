package Java8features;

import java.util.Arrays;

public class secondhighestelement {

	public static void main(String[] args) {
		int[] numbers = {10, 5, 20, 15, 25, 30};

        int secondHighest = Arrays.stream(numbers)
                .boxed() // convert int to Integer
                .sorted((a, b) -> Integer.compare(b, a)) // sort in descending order
                .skip(1) // skip the first element (highest number)
                .findFirst() // find the first element (second highest number)
                .orElseThrow(() -> new IllegalArgumentException("Array is empty or has only one element"));

        System.out.println("Second highest number: " + secondHighest);
	}
}
