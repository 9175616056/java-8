package hashmapcoding;
import java.util.HashMap;
import java.util.Map;

public class NonRepeatingInteger {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4};
        findNonRepeating(nums);
    }

    public static void findNonRepeating(int[] nums) {
        // Create a HashMap to store the frequency of each number
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        // Populate the frequency map
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        // Find and print the non-repeating integers
        System.out.println("Non-repeating integers:");
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
//            }HashMap: The program uses a HashMap to count the occurrences of each integer.
//            Key: The integer from the array.
//            Value: The frequency of the integer.
//            Logic: Iterate through the map to find keys (integers) with a frequency of 1, which means they do not repeat.
//            Output: Prints all non-repeating integers. For the given input, it will print:
//            yaml
//            Copy code
            }
        }
    }
}
