import java.util.*;

class Solution {
    public int orangesRotting(int[][] grid) {
        if (grid == null || grid.length == 0) return -1;

        int rows = grid.length;
        int cols = grid[0].length;
        int[][] time = new int[rows][cols];

        // sab cells ke time ko infinity se bhar do
        for (int i = 0; i < rows; i++) {
            Arrays.fill(time[i], Integer.MAX_VALUE);
        }

        // jitne rotten oranges h unse DFS start karo
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    dfs(grid, time, i, j, 0);
                }
            }
        }

        int ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) { // fresh orange
                    if (time[i][j] == Integer.MAX_VALUE) {
                        return -1; // unreachable fresh orange
                    }
                    ans = Math.max(ans, time[i][j]);
                }
            }
        }

        return ans;
    }

    private void dfs(int[][] grid, int[][] time, int i, int j, int currentTime) {
        // boundary check + better path check
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length
                || grid[i][j] == 0 || currentTime >= time[i][j]) {
            return;
        }

        time[i][j] = currentTime;

        dfs(grid, time, i - 1, j, currentTime + 1);
        dfs(grid, time, i + 1, j, currentTime + 1);
        dfs(grid, time, i, j - 1, currentTime + 1);
        dfs(grid, time, i, j + 1, currentTime + 1);
    }
}
