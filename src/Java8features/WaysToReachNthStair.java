package Java8features;
public class WaysToReachNthStair {

    public static int countways(int n) {
        if (n == 0) return 1; // One way to stay on the ground
        if (n == 1) return 1; // One way to reach the first stair
        
        // Create an array to store the number of ways to reach each stair
        int[] dp = new int[n + 1];
        dp[0] = 1; // Base case: 1 way to reach the 0th stair
        dp[1] = 1; // Base case: 1 way to reach the 1st stair
        
        // Fill the dp array using the relation dp[i] = dp[i-1] + dp[i-2]
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        
        // The number of ways to reach the nth stair
        return dp[n];
    }
}
