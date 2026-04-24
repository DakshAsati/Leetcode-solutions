class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {

        HashMap<Integer,Integer> map = new HashMap<>();

        int n = nums.length;
        int total = 0;

        map.put(0,-1);

        for(int i = 0; i < nums.length; i++){
            total += nums[i];

            int ans = total % k;
            if(ans < 0) ans += k;


            if(map.containsKey(ans)){
                if(i - map.get(ans) > 1){
                    return true;
                }
            }else{
                map.put(ans, i);
            }
        }
        return false;
    }
}