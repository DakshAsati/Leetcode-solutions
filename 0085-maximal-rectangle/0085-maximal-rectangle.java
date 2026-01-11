class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix == null || matrix.length == 0 || matrix[0].length == 0) return 0;


        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] height = new int[cols + 1];
        int maxArea = 0;


        for(char[] row : matrix){
            for(int i = 0; i < cols; i++){
                height[i] = (row[i] == '1') ? height[i] + 1 : 0;

            }

                int n = height.length;



                for(int i = 0; i < n; i++){
                    for(int j = i, minheight = Integer.MAX_VALUE; j < n; j++){
                        minheight = Math.min(minheight, height[j]);
                        int area = minheight * (j - i  + 1);
                        maxArea = Math.max(maxArea, area);
                    }
                }
            }

            return maxArea;
        }
        
    
}