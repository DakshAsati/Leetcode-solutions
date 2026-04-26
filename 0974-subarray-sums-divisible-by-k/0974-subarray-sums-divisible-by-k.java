class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);


        int total = 0;
        int count = 0;

        for(int num : nums){
            total += num;


            int rem = total % k;
            if(rem < k) rem += k;


            count += map.getOrDefault(rem, 0);

        }

        map.put(rem, map.getOrDefault(rem, 0) + 1);
        
    }

    return count;
}