class Solution {
    public int subarraySum(int[] nums, int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);

        int total = 0;
        int count = 0;

        for(int ch : nums){
            total += ch;

            if(map.containsKey(total - k)){
                count += map.get(total - k);
            }

            map.put(total, map.getOrDefault(total, 0) + 1);



        }  return count;      

    }
}