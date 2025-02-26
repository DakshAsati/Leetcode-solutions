import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int freshOranges = 0, minutes = 0;
        
        // Step 1: Add all rotten oranges to queue & count fresh oranges
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 2) {
                    queue.offer(new int[]{i, j});
                } else if (grid[i][j] == 1) {
                    freshOranges++;
                }
            }
        }
        
        if (freshOranges == 0) return 0;
        
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotten = false;
            
            for (int i = 0; i < size; i++) {
                int[] current = queue.poll();
                int x = current[0], y = current[1];
                
                for (int[] dir : directions) {
                    int newX = x + dir[0], newY = y + dir[1];
                    
                    if (newX >= 0 && newX < m && newY >= 0 && newY < n && grid[newX][newY] == 1) {
                        grid[newX][newY] = 2; // Rot the fresh orange
                        queue.offer(new int[]{newX, newY});
                        freshOranges--;
                        rotten = true;
                    }
                }
            }
            
            if (rotten) minutes++; // Only increment if at least one orange rots
        }
        
        return freshOranges == 0 ? minutes : -1;
    }
}
