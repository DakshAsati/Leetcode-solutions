class Solution {
    public int maxSubArray(int[] nums) {

        int maxsum = nums[0];
        int sum = 0;

        for(int i = 0; i < nums.length;i++){
            sum += nums[i];
            if(sum > maxsum) maxsum = sum;
            if(sum < 0) sum = 0;

        }
        return maxsum;
    }
}