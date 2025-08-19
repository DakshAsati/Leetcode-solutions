class Solution {
    public long zeroFilledSubarray(int[] nums) {

        long group = 0;
        long count = 0;

        for(int i = 0; i<= nums.length-1; i++){
            if(nums[i] == 0){
                count++;
                group += count;
            }else{
                count = 0;
            }

        }
        return group;
        
    }
}