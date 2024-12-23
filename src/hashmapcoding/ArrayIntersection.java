package hashmapcoding;

import java.util.HashMap;
import java.util.ArrayList;

public class ArrayIntersection {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};

        // Create a HashMap to store the frequency of elements from arr1
        HashMap<Integer, Integer> map = new HashMap<>();

        // Populate the HashMap with arr1 elements
        for (int num : arr1) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Find common elements (intersection)
        ArrayList<Integer> intersection = new ArrayList<>();
        for (int num : arr2) {
            if (map.containsKey(num) && map.get(num) > 0) {
                intersection.add(num);
                map.put(num, map.get(num) - 1);  // Decrement the frequency
            }
        }

        // Print the intersection
        System.out.println("Intersection of arrays: " + intersection);
    }
}

