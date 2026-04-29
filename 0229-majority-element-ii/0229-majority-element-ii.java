class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        int n = nums.length;

        List<Integer> result = new ArrayList<>();

        int count = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < n; i++){
            count  = map.getOrDefault(nums[i], 0) + 1;

            map.put(nums[i], count);

           

        }

        for(int key : map.keySet()){
            if(map.get(key) > n / 3){
                result.add(key);
            }
        }

        return result;

    }
}