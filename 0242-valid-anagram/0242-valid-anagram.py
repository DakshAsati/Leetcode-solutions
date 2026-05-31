class Solution:
    def isAnagram(self, s: str, t: str) -> bool:


        map1 = {}
        map2 = {}


        for i in range(len(s)):
            map1[s[i]] = map1.get(s[i], 0) + 1

        for j in range(len(t)):
            map2[t[j]] = map2.get(t[j], 0) + 1


        if map1 == map2:
            return True
        else:
            return False


        
        