class Solution {
    public int[] rearrangeArray(int[] nums) {

        int n = nums.length;

        int res[] = new int[n];

        int i = 0; int j = 1;

        for(int k = 0; k < n; k++){
            if(nums[k] < 0){
                res[j] = nums[k];
                j = j + 2;
            }else{
                res[i] = nums[k];
                i = i + 2;
            }
        }
        return res;
        
    }
}