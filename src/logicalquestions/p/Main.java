package logicalquestions.p;
import java.util.Arrays;

public class Main {

    public static int seatingStudents(int[] arr) {
        int K = arr[0];
        int[] occupied = Arrays.copyOfRange(arr, 1, arr.length);

        int rows = K / 2;

        boolean[][] seats = new boolean[rows][2];
        int x = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < 2; j++) {
                if (Arrays.binarySearch(occupied, x + 1) >= 0) {
                    seats[i][j] = true;
                } else {
                    seats[i][j] = false;
                }
                x++;
            }
        }

        int seating = 0;
        for (int i = 0; i < rows - 1; i++) {
            if (!seats[i][0] && !seats[i][1]) {
                seating++;
            }

            if (!seats[i][0] && !seats[i + 1][0]) {
                seating++;
            }

            if (!seats[i][1] && !seats[i + 1][1]) {
                seating++;
            }
        }

        if (!seats[rows - 1][0] && !seats[rows - 1][1]) {
            seating++;
        }

        return seating;
    }

    public static void main(String[] args) {
        // Test case
        int[] arr = {12, 2, 6, 7, 11};
        System.out.println(seatingStudents(arr)); // Output: 6
    }
}