package logicalquestions.p;

public class reverseStringonewords {

	 public static String reverseFirstWord(String input) {
	        // Split the input string into words
	        String[] words = input.split("\\s+");
	        // Check if there are at least two words
//	        if (words.length < 2) {
//	            return "Input string should contain at least two words";
//	        }	        
	        // Reverse the characters of the first word
	        StringBuilder reversedFirstWord = new StringBuilder(words[0]).reverse();
	        // Reconstruct the string with the reversed first word and the second word
	        StringBuilder result = new StringBuilder(reversedFirstWord);
	        for (int i = 1; i < words.length; i++) {
	            result.append(" ").append(words[i]);
	        } return result.toString();
	    }
//	 public static String reverseEntireString(String input) {
//	        // Reverse the entire input string
//	        return new StringBuilder(input).reverse().toString();
//       }
	    public static void main(String[] args) {
	        String input = "Hello World pot";
//	        String output = reverseFirstWord(input);
//	        System.out.println(output); // Output: olleH World	        
	        //for one word
	        String outputFirstWord = reverseFirstWord(input);
	        System.out.println(outputFirstWord); // Output: olleH World

	        // Reverse entire string
//	        String outputEntireString = reverseEntireString(input);
//	        System.out.println(outputEntireString); 
	    }
}
