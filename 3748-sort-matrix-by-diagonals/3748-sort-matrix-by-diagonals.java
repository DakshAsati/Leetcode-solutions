class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        Map<Integer, List<Integer>> result = new HashMap<>();


        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                result.computeIfAbsent(i - j, k -> new ArrayList<>()).add(grid[i][j]);

            }
        }

        for(int key : result.keySet()){
            if(key >= 0){
                result.get(key).sort(Collections.reverseOrder());
            }else{
                Collections.sort(result.get(key));
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                grid[i][j] = result.get(i - j).remove(0);
            }
        }
            return grid;

        
    }
}