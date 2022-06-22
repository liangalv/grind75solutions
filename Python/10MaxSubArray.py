#Given an interger array nums, find the contiguous subarray(containing at least one number)
#which has the largest sum and return its sum
class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        #we can do this in place in O(n)
        currSum = nums[0]
        currMax = 0
        for n in nums:
            if currSum < 0:
                currSum = 0
            currSum += n
            currMax = max(currMax, currSum)
        return currMax
    

        