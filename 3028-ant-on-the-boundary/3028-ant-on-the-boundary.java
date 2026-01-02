class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int n = nums.length;
        int count = 0;
        int[] prefix = new int[n];
        prefix[0] = nums[0];

        for(int i = 1; i <= n - 1; i++){
                prefix[i] = prefix[i - 1] + nums[i];

                if(prefix[i] == 0){
                    count++;
                }
                
            
    
        }
        return count;
    }
}

// nums[i] < 0 <- left[-nums[i]]
// nums[i] > 0 <- right[nums[i]]
// use prefix sum 
// for example -> [2,3,-5]
// prefix result -> [2,5,0]
// in first step -> nums[i] > 0 so 2 step right to the boundary
// in second step -> nums[i] > 0 so 5 step right 
// in third step -> nums[i] == 0 so on boundary[1]


// prefix[i] < 0 return  0;
// make a count
// make prefix sum -> [2,5,0]
// take last element and analyze it wheeter that is -ve, +ve or  0
// -ve return  0;
// +ve 
// 0 return 1;