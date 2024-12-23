package practice;





import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

class Result {

    public static List<String> computeParameterValue(List<List<String>> sources) {
        // Using LinkedHashMap to maintain the insertion order of keys
        Map<String, String> finalParams = new LinkedHashMap<>();

        // Iterate through each source from least to most preferred
        for (List<String> source : sources) {
            for (String pair : source) {
                // Split the string to get the key and value
                String[] keyValue = pair.split(":");
                String key = keyValue[0];
                String value = keyValue[1];

                // Put the entry in the map; if the key already exists, the value is updated
                finalParams.put(key, value);
            }
        }

        // Return the values of the map in the order of keys' first encounter
        return new ArrayList<>(finalParams.values());
    }
}

public class Solution {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        // Read the number of sources (rows)
        int sourcesRows = Integer.parseInt(bufferedReader.readLine().trim());

        // Read the number of parameters (columns) per source
        int sourcesColumns = Integer.parseInt(bufferedReader.readLine().trim());

        // Initialize a list to store all sources
        List<List<String>> sources = new ArrayList<>();

        // Read each source's parameters
        IntStream.range(0, sourcesRows).forEach(i -> {
            try {
                sources.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .collect(Collectors.toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        // Compute the final parameter values
        List<String> result = Result.computeParameterValue(sources);

        // Write the result to the output
        bufferedWriter.write(
            result.stream()
                .collect(Collectors.joining("\n"))
                + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}