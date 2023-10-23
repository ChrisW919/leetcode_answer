class Solution:
    def maxOperations(self, nums: List[int], k: int) -> int:
        fir_poi=0
        sec_poi=len(nums)-1
        nums=sorted(nums)
        count=0
        while(fir_poi<sec_poi):
            temp=nums[fir_poi]+nums[sec_poi]
            if (temp)>k:
                sec_poi-=1
            elif (temp)<k:
                fir_poi+=1
            else:
                count+=1
                fir_poi+=1
                sec_poi-=1
        return count

