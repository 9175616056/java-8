package dumy;
import java.io.*;
import java.util.HashMap;

class r {
    public static String divide(int dividend, int divisor) {
        // Edge case for division by zero
        if (divisor == 0) {
            throw new ArithmeticException("Division by zero");
        }

        // Determine the sign of the result
        boolean isNegative = (dividend < 0) ^ (divisor < 0);
        long absDividend = Math.abs((long) dividend);
        long absDivisor = Math.abs((long) divisor);
        
        // Integer part
        long integerPart = absDividend / absDivisor;
        long remainder = absDividend % absDivisor;
        
        StringBuilder result = new StringBuilder();
        if (isNegative && (integerPart != 0 || remainder != 0)) {
            result.append('-');
        }
        result.append(integerPart);

        // If there is no remainder, return the integer part
        if (remainder == 0) {
            return result.toString();
        }

        // Decimal part
        result.append('.');
        HashMap<Long, Integer> remainderMap = new HashMap<>();
        remainderMap.put(remainder, result.length());

        while (remainder != 0) {
            remainder *= 10;
            long decimalPart = remainder / absDivisor;
            result.append(decimalPart);
            remainder %= absDivisor;

            if (remainderMap.containsKey(remainder)) {
                int index = remainderMap.get(remainder);
                result.insert(index, '(');
                result.append(')');
                return result.toString();
            }
            remainderMap.put(remainder, result.length());
        }

        return result.toString();
    }
}

public class problemsolve {
    public static void main(String[] args) throws IOException {
        // Reading input
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int dividend = Integer.parseInt(bufferedReader.readLine().trim());
        int divisor = Integer.parseInt(bufferedReader.readLine().trim());

        // Determine the output file path
        String outputPath = System.getenv("OUTPUT_PATH");
        if (outputPath == null) {
            outputPath = "output.txt";  // Provide a default filename if OUTPUT_PATH is not set
        }

        // Writing output
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputPath));
        String result = Result.divide(dividend, divisor);
        bufferedWriter.write(result);
        bufferedWriter.newLine();

        // Close the resources
        bufferedReader.close();
        bufferedWriter.close();
    }
}

