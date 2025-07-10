class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        

        boolean[] rowzero = new boolean[rows];
        boolean[] colszero = new boolean[cols];


        for(int i = 0; i< rows; i++){
            for(int j = 0; j < cols; j++){
                if(matrix[i][j] == 0){
                    rowzero[i] = true;
                    colszero[j] = true;
                }
            }
        }

        for(int i = 0; i < rows; i++){
            if(rowzero[i]){
                for(int j = 0; j < cols; j++){
                    matrix[i][j] = 0;

                }
            }
        }

        for(int j = 0; j < cols; j++){
            if(colszero[j]){
                for(int i = 0; i < rows; i++){
                    matrix[i][j] = 0;
                }
            }
        }


      
        
    }
}