class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int[] res = new int[n]; 
        
        int i = 0, j = n - 1;  

        for (int k = 0; k < n; k++) {
            if (nums[k] % 2 == 0) {  
                res[i] = nums[k];  
                i++;
            } else {  
                res[j] = nums[k];  
                j--;
            }
        }
        
        return res;
    }
}
