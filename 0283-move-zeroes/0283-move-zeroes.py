class Solution:
    def moveZeroes(self, nums: List[int]) -> None:

        index = 0
        n = len(nums)


        for i in range(len(nums)):
            if nums[i] != 0:
                nums[index] = nums[i]
                index += 1


        while index < len(nums):
            nums[index] = 0
            index += 1



        



        