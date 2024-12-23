package hashmapcoding;
import java.util.HashMap;
import java.util.Map;

public class ElementFrequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 1, 4, 3};

        // Create a HashMap to store the frequency of elements
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        // Traverse the array
        for (int num : arr) {
            // If the element is already present, increment its count
        	//In Java, the getOrDefault method is used with Map interfaces (like HashMap, TreeMap, etc.).
        	//It retrieves the value associated with a specified key,
        	//or returns a default value if the key is not found in the map.
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Print the frequency of each element
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("Element: " + entry.getKey() + ", Frequency: " + entry.getValue());
        }
    }
}
