class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:


        n = len(nums)

        for i in range(n):
            for j in range(n):


                if i == j:
                    continue

                sum = nums[i] + nums[j]

                if sum == target:
                    return [i,j]

        return [-1,-1]

            
