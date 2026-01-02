class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;

        int total = 0;
        int[] ans = new int[n];

        for(int x : nums) total += x;


        int leftsum = 0;

        for(int i = 0; i < n; i++){
            int rightsum = total - leftsum - nums[i];
            ans[i] = Math.abs(leftsum - rightsum);
            leftsum += nums[i];
        }
        return ans;
        
        
        
    }
}

