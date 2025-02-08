import java.util.Arrays;

class Solution {
    public int hIndex(int[] citations) {
        int n = citations.length;

       
        Arrays.sort(citations);

        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (citations[n - 1 - i] > i) { 
                count++;
            } else {
                break;
            }
        }
        return count;
    }
}
