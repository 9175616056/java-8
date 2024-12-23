package hashmapcoding;
import java.util.Hashtable;

public class DisjointArrays {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {5, 6, 7, 8};

        if (areDisjoint(arr1, arr2)) {
            System.out.println("The arrays are disjoint.");
        } else {
            System.out.println("The arrays are not disjoint.");
        }
    }

    public static boolean areDisjoint(int[] arr1, int[] arr2) {
        Hashtable<Integer, Boolean> table = new Hashtable<>();

        // Store all elements from the first array in the table
        for (int num : arr1) {
            table.put(num, true);
        }

        // Check if any element from the second array exists in the table
        for (int num : arr2) {
            if (table.containsKey(num)) {
                return false;  // Not disjoint if there's a common element
            }
        }

        return true;
    }
}

