package logicalquestions.p;

import java.util.HashSet;
import java.util.Set;

public class Stringhasalluniquecharacter {
	
	    public static boolean hasUniqueCharacters(String s) {
	        // Create a set to store unique characters
	        Set<Character> charsSeen = new HashSet<>();

	        // Iterate through each character in the string
	        for (char c : s.toCharArray()) {
	            // If the character is already in the set, we found a duplicate
	            if (charsSeen.contains(c)) {
	                return false;
	            }
	            // Add the character to the set
	            charsSeen.add(c);
	        }
	        // If we finish the loop without finding duplicates, return True
	        return true;
	    }

	    public static void main(String[] args) {
	        String string1 = "abcdef";
	        String string2 = "hello";
	        System.out.println(hasUniqueCharacters(string1));  // Output: true
	        System.out.println(hasUniqueCharacters(string2));  // Output: false
	    }
	}

