package hashmapcoding;
import java.util.HashMap;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        
        // Create a HashMap to store the frequency of characters
        HashMap<Character, Integer> charCountMap = new HashMap<>();
        
        // Traverse the string and store the frequency of each character
        for (char ch : str.toCharArray()) {
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        
        // Traverse the string again and find the first non-repeating character
        for (char ch : str.toCharArray()) {
            if (charCountMap.get(ch) == 1) {
                System.out.println("First non-repeating character: " + ch);
                return;
            }
        }

        System.out.println("No non-repeating characters found.");
    }
}
