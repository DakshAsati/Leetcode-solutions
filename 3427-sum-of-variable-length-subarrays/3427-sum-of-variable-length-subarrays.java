class Solution {
    public int subarraySum(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0;

        long[] prefix = new long[n];
        prefix[0] = nums[0];

        for (int i = 1; i < n; i++) {
            prefix[i] = prefix[i - 1] + nums[i];
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            
            int l = Math.max(0, i - nums[i]);

            if (l > 0) {
                ans += prefix[i] - prefix[l - 1];
            } else {
                ans += prefix[i];
            }
        }

        return (int) ans;
    }
}
