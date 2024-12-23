package Java8features;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Scanner;
import java.io.*;
import java.util.*;

public class TestClass {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        
        // Reading input values
        int A = Integer.parseInt(br.readLine().trim());
        int B = Integer.parseInt(br.readLine().trim());
        int C = Integer.parseInt(br.readLine().trim());

        // Computing the result
        long result = Balanced(A, B, C);
        System.out.println(result);
        
        wr.close();
        br.close();
    }

    static long Balanced(int A, int B, int C) {
        long result = 0;

        // Iterate over the number of powerful resources selected (p)
        for (int p = 4; p <= Math.min(A, C-1); p++) {
            int weakCount = C - p;
            
            // Ensure that we can select weakCount weak resources
            if (weakCount >= 1 && weakCount <= B) {
                // Calculate combinations C(A, p) * C(B, weakCount)
                result += combinations(A, p) * combinations(B, weakCount);
            }
        }

        return result;
    }

    // Helper function to compute C(n, k) = n! / (k! * (n-k)!)
    static long combinations(int n, int k) {
        if (k > n) return 0;
        long result = 1;
        for (int i = 1; i <= k; i++) {
            result = result * (n - i + 1) / i;
        }
        return result;
    }
}
