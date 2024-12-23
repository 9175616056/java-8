package hashmapcoding;
import java.util.HashMap;

public class PairsWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {1, 5, 7, -1, 5};
        int targetSum = 6;

        // Create a HashMap to store the elements and their frequencies
        HashMap<Integer, Integer> map = new HashMap<>();

        // Find pairs that add up to the target sum
        for (int num : arr) {
            int complement = targetSum - num;

            // Check if complement exists in the map
            if (map.containsKey(complement)) {
                System.out.println("Pair: (" + num + ", " + complement + ")");
            }
            
            // Add current element to the map
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
    }
}

