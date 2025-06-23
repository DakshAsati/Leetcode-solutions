class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int windowsum = 0;
        int n = arr.length;
        int count = 0;
        

        for(int i = 0 ; i < k; i++){
            windowsum += arr[i];

        }

        if(windowsum / k >= threshold){
            count++;
        }
           

            for(int i = k; i < n; i++){
                windowsum += arr[i] - arr[i - k];
                if(windowsum/k >= threshold){
                   count = count + 1;
                }
            }
            return count;
        
    }
}