class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int left = 0;
        int right = 0;

        int[] arr = new int[n];
        Arrays.fill(arr, 1);

        for (int i = 0; i < n - 1; i++) {  
            if (ratings[i + 1] > ratings[i]) {  
                arr[i + 1] = arr[i] + 1;  
            }
        }
        
        for (int j = n - 1; j > 0; j--) {  
            if (ratings[j - 1] > ratings[j]) { 
                arr[j - 1] = Math.max(arr[j - 1], arr[j] + 1);  
            }
        }

        return Arrays.stream(arr).sum(); 
    }
}
