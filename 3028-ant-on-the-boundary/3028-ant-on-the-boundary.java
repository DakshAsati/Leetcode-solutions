class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int pos = 0;
        int count = 0;

        for(int x : nums){
            pos += x;

            if(pos == 0){
                count++;
            }

        }
            return count;

        
        
    }
}