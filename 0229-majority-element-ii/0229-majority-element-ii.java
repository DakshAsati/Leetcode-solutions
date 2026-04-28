class Solution {
    public List<Integer> majorityElement(int[] nums) {

        int n = nums.length;

        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        int count = 0;
       

        for(int i = 0; i < n; i++){
            count = map.getOrDefault(nums[i], 0) + 1;

            map.put(nums[i], count);

            
        }
        for(int key : map.keySet()){
            if(map.get(key) > n / 3){
                list.add(key);
            }
        }

        return list;

       
        
        
    }
}