class Solution {
    public int repeatedNTimes(int[] nums) {

     HashSet<Integer> seen = new HashSet<>();

     for(int x : nums){
        if(!seen.add(x))
            return x;
        
     }
        return  - 1;
     }
    }


//length = 2 * n
// nums -> n + 1
// nums length
// for (i = 0; i < n; i++)
// if(nums[i] == nums[i + 1])
// return i;



// int count = 0;
// int candidate = 0;
// for each loop
// check count == 0
// num = candidate
// if statement (cand = num)
// count++
// else count--
//return candidate