package hashmapcoding;
import java.util.HashSet;

public class FirstRepeatingNumber {
    public static void main(String[] args) {
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int result = findFirstRepeatingNumber(arr);
        if (result != -1) {
            System.out.println("The first repeating number is: " + result);
        } else {
            System.out.println("No repeating numbers found.");
        }
    }
    public static int findFirstRepeatingNumber(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (set.contains(arr[i])) {
                return arr[i];
            } else {
                set.add(arr[i]);
            }
        }
        return -1; // No repeating numbers
    }
}
