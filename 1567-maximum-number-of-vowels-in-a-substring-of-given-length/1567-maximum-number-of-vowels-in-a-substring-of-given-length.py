
class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        count=0
        poi=k
        for i in range(k):
            if s[i] in "aeiou":
                count+=1
        max_c=count
        while(poi<len(s)):
            if s[poi] in "aeiou":
                count+=1
            if s[poi-k] in "aeiou":
                count-=1
            if count>max_c:
                max_c=count
            poi+=1
        return max_c



        
