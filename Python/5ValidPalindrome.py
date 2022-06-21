class Solution:
    def isPalindrome(self, s: str) -> bool:
    #we wish to use the two pointer method, remember to account for off by one errors 
        ptr1 = 0
        ptr2 = len(s) - 1
        while (ptr2 > ptr1):
            ptr1Char = s[ptr1].lower()
            ptr2Char = s[ptr2].lower()
            if ptr1Char.isalnum() and ptr2Char.isalnum():
                if ptr1Char != ptr2Char:
                    return False
                ptr1 += 1
                ptr2 += 1
            if not (ptr1Char.isalnum()):
                ptr1 += 1
            if not (ptr2Char.isalnum()):
                ptr2 += 1
        return True
        



