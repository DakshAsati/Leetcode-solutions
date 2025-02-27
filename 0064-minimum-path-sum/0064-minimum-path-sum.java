class Solution {
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[n][m];
        for(int i=0; i<n; i++){
            Arrays.fill(dp[i],-1);
        }
        return find(grid,dp,n-1,m-1);
    }
    private int find(int[][] grid, int[][] dp, int i, int j){
        //base cases
        if(i==0 && j==0) return grid[i][j];
        if(i<0 || j<0) return Integer.MAX_VALUE;
        if(dp[i][j] != -1) return dp[i][j];

        //recursive part
        dp[i][j]=grid[i][j] + Math.min(find(grid,dp,i-1,j), find(grid,dp,i,j-1));
        return dp[i][j];
    }
}