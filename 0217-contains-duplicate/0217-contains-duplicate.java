class Solution {
    public boolean containsDuplicate(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        for(int i = 0; i < n - 1; i++){
            if(nums[i] == nums[i + 1]){
                return true;
            }
        
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
