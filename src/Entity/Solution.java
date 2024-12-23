package Entity;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // Ensure we handle the output path properly
        String outputPath = System.getenv("OUTPUT_PATH");
        if (outputPath == null) {
            outputPath = "output.txt";  // Default if OUTPUT_PATH is not set
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));

        // Reading inputs
        int workHours = Integer.parseInt(bufferedReader.readLine().trim());
        int dayHours = Integer.parseInt(bufferedReader.readLine().trim());
        String pattern = bufferedReader.readLine();

        // Get all possible schedules
        List<String> result = Result.findSchedules(workHours, dayHours, pattern);

        // Write the result to the output
        bufferedWriter.write(String.join("\n", result));
        bufferedReader.close();
        bufferedWriter.close();
    }
}

class Result {

    public static List<String> findSchedules(int workHours, int dayHours, String pattern) {
        List<String> results = new ArrayList<>();
        int totalHoursScheduled = 0;
        int questionMarkCount = 0;

        // Step 1: Calculate current total hours and count question marks
        for (char ch : pattern.toCharArray()) {
            if (ch == '?') {
                questionMarkCount++;
            } else {
                totalHoursScheduled += Character.getNumericValue(ch);
            }
        }

        // Step 2: Determine how many additional hours are needed
        int remainingHours = workHours - totalHoursScheduled;

        // Step 3: If no valid schedules are possible, return empty results
        if (remainingHours < 0 || remainingHours > questionMarkCount * dayHours) {
            return results; // No valid schedules possible
        }

        // Step 4: Generate all possible schedules using backtracking
        generateSchedules(pattern.toCharArray(), 0, remainingHours, questionMarkCount, dayHours, results);
        Collections.sort(results);
        return results;
    }

    private static void generateSchedules(char[] pattern, int index, int remainingHours, int questionMarkCount, int dayHours, List<String> results) {
        if (index == pattern.length) {
            // Base case: When all '?' are filled, check if remaining hours match exactly
            if (remainingHours == 0) {
                results.add(new String(pattern));
            }
            return;
        }

        if (pattern[index] == '?') {
            // Replace '?' with digits from 0 to dayHours
            for (int hours = 0; hours <= dayHours; hours++) {
                // Ensure that the remaining hours is still feasible
                if (remainingHours >= hours && remainingHours - hours <= (questionMarkCount - 1) * dayHours) {
                    pattern[index] = (char) ('0' + hours); // Set the current '?' to hours
                    generateSchedules(pattern, index + 1, remainingHours - hours, questionMarkCount - 1, dayHours, results);
                    pattern[index] = '?'; // Reset the '?' after the recursive call
                }
            }
        } else {
            // Continue to the next character if it's already filled
            generateSchedules(pattern, index + 1, remainingHours, questionMarkCount, dayHours, results);
        }
    }
}
