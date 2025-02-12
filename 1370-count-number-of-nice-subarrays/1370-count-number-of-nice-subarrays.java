class Solution {
    public int numberOfSubarrays(int[] nums, int k) {

        int res = 0; int count = 0; int left = 0;

        for(int i = 0; i < nums.length; i++){
            if(nums[i] %2 == 1){
                k--;
                count = 0;
            }

            while(k == 0){
                if(nums[left] % 2 == 1){
                    k++;
                }
                left++;
                count++;
            }

            res += count;
        }
        return res;
    }
}