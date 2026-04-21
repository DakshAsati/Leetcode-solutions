class Solution {
    public boolean containsDuplicate(int[] nums) {


        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            if(map.containsKey(nums[i])){
                return true;
            }

            map.put(nums[i],i);
        }

        return false;

       

    }
    }


/* 

use arrays
sort it
iterate on array
check whether i == i + 1 or not and i == i - 1 or not
return true or false based on condintipon

**/
