class Solution {
    public int climbStairs(int n) {
        if(n <= 1)return 1;
        int[] f = new int[n + 2];
        f[0] = 1; f[1] = 1;
        for(int i = 2; i <= n; i++){
            f[i] = f[i - 2] + f[ i - 1];

        }
        return f[n];
        
    }
}