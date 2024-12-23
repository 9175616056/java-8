package Java8features;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class secondlastString {

	public static void main(String[] args) {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Using Java 8 Streams to find the second last element
        Optional<String> secondLastElement = list.stream()
                .skip(list.size() - 2)
                .findFirst();

        // Printing the second last element if present
        secondLastElement.ifPresent(System.out::println);
    }
}
