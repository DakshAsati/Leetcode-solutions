class Solution {
    public void solve(char[][] board) {
        if (board == null || board.length == 0) return;

        int m = board.length;
        int n = board[0].length;

        for (int i = 0; i < m; i++) {
            if (board[i][0] == 'O') dfs(board, i, 0, 'O', '#');
            if (board[i][n - 1] == 'O') dfs(board, i, n - 1, 'O', '#');
        }
        for (int j = 0; j < n; j++) {
            if (board[0][j] == 'O') dfs(board, 0, j, 'O', '#');
            if (board[m - 1][j] == 'O') dfs(board, m - 1, j, 'O', '#');
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O') board[i][j] = 'X';
                if (board[i][j] == '#') board[i][j] = 'O';
            }
        }
    }

    public void dfs(char[][] board, int m, int n, char pointer, char newpointer) {
        if (m < 0 || m >= board.length || n < 0 || n >= board[0].length) return;
        if (board[m][n] != pointer) return;

        board[m][n] = newpointer;

        dfs(board, m + 1, n, pointer, newpointer);
        dfs(board, m - 1, n, pointer, newpointer);
        dfs(board, m, n - 1, pointer, newpointer);
        dfs(board, m, n + 1, pointer, newpointer);
    }
}
