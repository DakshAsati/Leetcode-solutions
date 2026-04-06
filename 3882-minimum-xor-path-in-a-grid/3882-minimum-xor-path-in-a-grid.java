
class Solution {
    int result = Integer.MAX_VALUE;
    boolean visited[][][];
    public int minCost(int[][] grid) {

        if(grid == null || grid.length == 0) return 0;


        int m = grid.length;
        int n = grid[0].length;

     visited = new boolean [m][n][1024];


        solve(grid, 0, 0,0);
    

            return result;
        

    }

    public void solve(int[][] grid, int r , int c, int xor){

        if(visited[r][c][xor]) return;
        visited[r][c][xor] = true;


        xor ^= grid[r][c];

        if(r == grid.length - 1 && c == grid[0].length - 1){
            result = Math.min(result, xor);
            return;
        }

        if(r + 1 < grid.length){
            solve(grid, r + 1,c,xor);
        }

        if(c + 1 < grid[0].length){
            solve(grid, r, c + 1,xor);
        }


    }
}