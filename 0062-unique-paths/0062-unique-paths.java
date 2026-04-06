class Solution {
    public int uniquePaths(int m, int n) {
        int [][] grid = new int[m][n];

       

       return solve(grid, 0 ,0,m,n);

        
    }

    public int solve(int[][] grid, int sr, int sc, int m, int n){
        if(sr >= m || sc >= n) return 0;
        if(sr == m - 1 && sc == n - 1) return 1;

        if(grid[sr][sc] != 0) return grid[sr][sc];


        grid[sr][sc] = solve(grid, sr + 1 ,sc, m , n ) + solve( grid, sr, sc + 1, m ,n );

        return grid[sr][sc];



    }
}