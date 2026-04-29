class Solution {
    public int majorityElement(int[] nums) {

        int n  = nums.length;
        int count = 0;

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            count = map.getOrDefault(nums[i], 0) + 1;

            map.put(nums[i],count);

            if(count > n / 2){
                return nums[i];
            }

        }

        return 0;
        
    }
}