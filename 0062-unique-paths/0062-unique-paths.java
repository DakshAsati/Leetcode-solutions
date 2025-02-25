class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        return countPaths(0, 0, m, n, dp);
    }

    private int countPaths(int sr, int sc, int m, int n, int[][] dp) {
        if (sr >= m || sc >= n) return 0; // Out of bounds
        if (sr == m - 1 && sc == n - 1) return 1; // Reached destination
        
        if (dp[sr][sc] != 0) return dp[sr][sc]; // Use precomputed result

        // Store the result in dp array
        dp[sr][sc] = countPaths(sr + 1, sc, m, n, dp) + countPaths(sr, sc + 1, m, n, dp);
        return dp[sr][sc];
    }
}
