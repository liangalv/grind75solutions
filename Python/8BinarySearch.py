import time

class Solution:
    def search(self, nums , target) -> int:
        l,r = 0, len(nums)
        mid = int((l+r)/2)
        while(l <=r):
            m = (l+r)//2
            if nums[m] > target:
                r = m - 1
            elif nums[m] < target:
                l = m + 1
            else:
                return m
        return -1
        
        
        
dum = [-1,0,3,5,9,12] 
target = 2 
solu = Solution()
print(solu.search(dum,target))