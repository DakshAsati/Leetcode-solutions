class Solution:
    def maxProfit(self, prices: List[int]) -> int:


        maxprofit = 0
        left = 0

      


      

        for i in range(len(prices)):

            if prices[i] < prices[left]:
                left = i

            else:
                currprofit = prices[i] - prices[left]
                maxprofit = max(maxprofit, currprofit)


        return maxprofit



