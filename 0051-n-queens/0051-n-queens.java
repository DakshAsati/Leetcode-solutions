class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        char[][] board = new char[n][n];
        
        // Initialize board with '.'
        for (int i = 0; i < n; i++) 
            Arrays.fill(board[i], '.');
        
        // Track occupied cols and diagonals
        boolean[] cols = new boolean[n];         // column conflicts
        boolean[] diag1 = new boolean[2 * n - 1]; // '/' diagonal
        boolean[] diag2 = new boolean[2 * n - 1]; // '\' diagonal
        
        backtrack(0, board, result, cols, diag1, diag2);
        return result;
    }

    void backtrack(int row, char[][] board, List<List<String>> result,
                   boolean[] cols, boolean[] diag1, boolean[] diag2) {
        int n = board.length;
        
        if (row == n) {
            List<String> config = new ArrayList<>();
            for (char[] r : board)
                config.add(new String(r));
            result.add(config);
            return;
        }

        for (int col = 0; col < n; col++) {
            int d1 = row - col + n - 1;
            int d2 = row + col;
            if (cols[col] || diag1[d1] || diag2[d2]) continue; // conflict

            // Place queen
            board[row][col] = 'Q';
            cols[col] = diag1[d1] = diag2[d2] = true;

            // Move to next row
            backtrack(row + 1, board, result, cols, diag1, diag2);

            // Backtrack
            board[row][col] = '.';
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }
}
	