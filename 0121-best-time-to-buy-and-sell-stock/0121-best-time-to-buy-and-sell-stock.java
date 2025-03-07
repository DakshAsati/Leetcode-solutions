class Solution {
    public int maxProfit(int[] prices) {
        int left = 0;
        int maxprofit = 0;

        for(int i = 1; i < prices.length; i++){
            if(prices[i] < prices[left]){
                left = i;
            }else{
                int currprofit = prices[i] - prices[left];
                maxprofit = Math.max(currprofit,maxprofit);
            }

        }
        return maxprofit;


        
    }
}