class Solution {
    public int flipgame(int[] fronts, int[] backs) {
        int n = fronts.length;

        Set<Integer> banned = new HashSet<>();

        for(int i = 0; i < n; i++){
            if(fronts[i] == backs[i]){
                banned.add(fronts[i]);
            }
        }
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(!banned.contains(fronts[i])){
                ans = Math.min(ans, fronts[i]);

            }
            if(!banned.contains(backs[i])){
                ans = Math.min(ans, backs[i]);
            }
        }

        return ans == Integer.MAX_VALUE ? 0: ans;
        
    }
}