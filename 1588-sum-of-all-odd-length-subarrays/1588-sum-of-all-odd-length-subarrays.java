class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int n = arr.length;
        int sum = 0;

        for(int len = 1; len <= n ;len += 2){ //1,3,5
            for(int i = 0; i + len <= n; i++){
                for(int j = i; j < i + len ; j++){
                    sum += arr[j];
                }
               

            }
        
        
        }
         return sum;
    }
}