class Solution {
    public int subarraysDivByK(int[] nums, int k) {

        int n = nums.length;
        int total = 0;
        int count = 0;

        int[] freq = new int[k];
        freq[0] = 1;

        for(int num : nums){
            total += num;


            int rem = total % k;
            if(rem < 0) rem += k;

            count += freq[rem];
            freq[rem]++;



        }

        return count;

        
    }
}