class Solution {
    private final int[][] dirs = {{-1, 1}, {1, 1}, {1, -1}, {-1, -1}};
    private int m, n;
    private int[][][][][] memo; 
    public int lenOfVDiagonal(int[][] grid) {
        m = grid.length;
        n = grid[0].length;

       
        memo = new int[m][n][2][2][4];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                for (int t = 0; t < 2; t++)
                    for (int num = 0; num < 2; num++)
                        for (int d = 0; d < 4; d++)
                            memo[i][j][t][num][d] = -1;

        int ans = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    for (int d = 0; d < 4; d++) {
                        int dx = dirs[d][0], dy = dirs[d][1];
                        ans = Math.max(ans, 1 + dfs(grid, i + dx, j + dy, false, 2, d));
                    }
                }
            }
        }
        return ans;
    }

    private int dfs(int[][] grid, int i, int j, boolean turned, int num, int dir) {
        if (i < 0 || i >= m || j < 0 || j >= n) return 0;
        if (grid[i][j] != num) return 0;

        int numIdx = (num == 2 ? 1 : 0); 
        int turnIdx = turned ? 1 : 0;

        if (memo[i][j][turnIdx][numIdx][dir] != -1) {
            return memo[i][j][turnIdx][numIdx][dir];
        }

        int nextNum = (num == 2 ? 0 : 2);
        int dx = dirs[dir][0], dy = dirs[dir][1];

        int res = 1 + dfs(grid, i + dx, j + dy, turned, nextNum, dir);

        if (!turned) {
            int newDx = dy, newDy = -dx;
            int newDir = -1;
            for (int k = 0; k < 4; k++) {
                if (dirs[k][0] == newDx && dirs[k][1] == newDy) {
                    newDir = k;
                    break;
                }
            }
            if (newDir != -1) {
                res = Math.max(res, 1 + dfs(grid, i + newDx, j + newDy, true, nextNum, newDir));
            }
        }

        memo[i][j][turnIdx][numIdx][dir] = res;
        return res;
    }
}
