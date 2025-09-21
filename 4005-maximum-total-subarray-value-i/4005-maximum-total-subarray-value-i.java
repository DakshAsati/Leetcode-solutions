class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int maxval = Integer.MIN_VALUE;
        int minval = Integer.MAX_VALUE;


        for(int num : nums){
            maxval = Math.max(maxval, num);
            minval = Math.min(minval, num);
        }

        long result = maxval - minval;
        return result * (long) k;
        
    }
}