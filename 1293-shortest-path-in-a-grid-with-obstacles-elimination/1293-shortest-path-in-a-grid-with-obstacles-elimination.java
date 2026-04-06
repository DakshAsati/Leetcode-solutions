class Solution {
    public int shortestPath(int[][] grid, int k) {
        int m = grid.length, n = grid[0].length;
        if (k >= m + n - 2) return m + n - 2;

        // vis[row][col][obstacles_eliminated]
        // We use boolean here because BFS finds the shortest path FIRST
        boolean[][][] vis = new boolean[m][n][k + 1];
        
        // Queue stores: {row, col, xor (eliminated), count (distance)}
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{0, 0, 0, 0});
        vis[0][0][0] = true;

        int[][] dirs = {{0,1}, {0,-1}, {1,0}, {-1,0}};

        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int i = curr[0], j = curr[1], xor = curr[2], count = curr[3];

            if (i == m - 1 && j == n - 1) return count;

            for (int[] d : dirs) {
                int ni = i + d[0], nj = j + d[1];

                if (ni >= 0 && ni < m && nj >= 0 && nj < n) {
                    int nextEliminated = xor + grid[ni][nj];
                    
                    if (nextEliminated <= k && !vis[ni][nj][nextEliminated]) {
                        vis[ni][nj][nextEliminated] = true;
                        q.offer(new int[]{ni, nj, nextEliminated, count + 1});
                    }
                }
            }
        }
        return -1;
    }
}