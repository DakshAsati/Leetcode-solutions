class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {

        int windowsum = 0;
        int n = arr.length;
        int count = 0; // Moved and initialized here

        for (int i = 0; i < k; i++) {
            windowsum += arr[i];
        }

        // Check the first window
        if (windowsum / k >= threshold) {
            count++;
        }

        // Slide the window
        for (int i = k; i < n; i++) {
            windowsum += arr[i] - arr[i - k];
            if (windowsum / k >= threshold) {
                count++;
            }
        }

        return count;
    }
}
