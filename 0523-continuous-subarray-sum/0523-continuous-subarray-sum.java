class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

     HashMap<Integer,Integer> map = new HashMap<>();
     map.put(0,-1);


        int n = nums.length;

        int total = 0;


        for(int i = 0; i < n; i++){
            total += nums[i];


            int rem = total % k;
            if(rem < 0) rem += k;

            if(map.containsKey(rem)){
            if(i - map.get(rem) > 1){
                return true;
            }

            }else{
                map.put(rem,i);
            }


        }
            return false;

            
        
        
    }
}