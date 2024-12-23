package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
    public static String removeDuplicates(String input) {
        Set<Character> seen = new LinkedHashSet<>();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (seen.add(ch)) {
                result.append(ch);  // Only append if the character is not already in the set
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "mississippi is a river";
        String output = removeDuplicates(input);
        System.out.println("Output: " + output);
    }
}
