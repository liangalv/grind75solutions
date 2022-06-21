class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False
        sMap, tMap = {}, {}
        for i in range(len(s)):
            sMap[s[i]] = sMap.get(sMap[i], 0) + 1
            tMap[t[i]] = tMap.get(tMap[i], 0) + 1
        for key in sMap:
            if sMap[key] != tMap.get(t[key], 0)
                return False
        return True 
          