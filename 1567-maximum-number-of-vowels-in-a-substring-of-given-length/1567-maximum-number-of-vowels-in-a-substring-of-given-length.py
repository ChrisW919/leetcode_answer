class Solution:
    def maxVowels(self, s: str, k: int) -> int:
        q1 =[]
        count=0
        poi=k
        for i in range(k):
            if s[i] in ['a','e','i','o','u']:
                count+=1
                q1.append(True)
            else:
                q1.append(False)
        
        max_c=count
        while(poi<len(s)):
            if s[poi] in ['a','e','i','o','u']:
                count+=1
                q1.append(True)
            else:
                q1.append(False)
            if q1.pop(0):
                count-=1
            if count>max_c:
                max_c=count
            poi+=1
        return max_c



        
