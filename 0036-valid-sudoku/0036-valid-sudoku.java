class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];


        for(int i = 0; i < 9; i++){
            row[i] = new HashSet<>();
            cols[i] = new HashSet<>();
            box[i] = new HashSet<>();

        }

        for(int r = 0; r < 9; r++){
            for(int c = 0; c < 9; c++){
                char val = board[r][c];


                if(val == '.') continue;


                int boxindex = (r / 3)* 3 + (c / 3);


                if(row[r].contains(val) || cols[c].contains(val) || box[boxindex].contains(val)){
                    return false;
                }

            
            row[r].add(val);
            cols[c].add(val);
            box[boxindex].add(val);
            }
        }
        
        return true;
    }
}