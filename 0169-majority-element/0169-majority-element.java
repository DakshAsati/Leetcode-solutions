class Solution {
    public int majorityElement(int[] nums) {

        int n = nums.length;
        int count = 0;
        int max = 0;
        int result = nums[0];


    HashMap<Integer,Integer> map = new HashMap<>();

    for(int i = 0; i < n; i++){
       count = map.getOrDefault(nums[i], 0)  + 1;
       map.put(nums[i] , count);

       if(count > max){
        max = count;
        result = nums[i];
      
       }

    }

       return result;

    

    
    }
}