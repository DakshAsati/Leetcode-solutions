class Solution:
    def maxProfit(self, prices: List[int]) -> int:

        left = 0
        maxprofit = 0


        for i in range(1, len(prices)):
            if(prices[i] < prices[left]):
                left = i

            else:
                currprofit = prices[i] - prices[left]
                maxprofit = max(maxprofit, currprofit)

        return maxprofit


        