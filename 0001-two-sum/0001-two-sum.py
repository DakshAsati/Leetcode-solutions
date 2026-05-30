class Solution(object):
    def twoSum(self, nums, target):
      mp = {}

      for i in range(len(nums)):
            complement = target - nums[i]

            if complement in mp:
                return [mp[complement], i]

            mp[nums[i]] = i

      return [-1, -1]