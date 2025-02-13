class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int sum1 = 0; int sum2 = 0;

        for(int i = 0; i < k; i++){
            sum1 += cardPoints[i];
        }

        int maxsum = sum1;

        int i = 0; 
        while(i < k){
            sum1 = sum1 - cardPoints[k-i-1] + cardPoints[n - 1- i];
            maxsum = Math.max(maxsum, sum1);
            i++;
        }

        return maxsum;

        
     
    }
}