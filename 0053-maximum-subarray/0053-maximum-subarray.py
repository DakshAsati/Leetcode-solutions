class Solution:
    def maxSubArray(self, nums: List[int]) -> int:

       if len(nums) == 0:
        return 0

       maxsum = nums[0]
       sum = 0

       for i in range(len(nums)):
        sum += nums[i]


        if sum > maxsum:
            maxsum = sum

        if sum < 0:
            sum = 0
 
       return maxsum









        