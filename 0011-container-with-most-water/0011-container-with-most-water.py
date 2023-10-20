class Solution:
    def maxArea(self, height: List[int]) -> int:
        first_p=0
        second_p=-1
        count_list=len(height)-1
        w_max=0
        for count in range(len(height)):
            if height[first_p]<=height[second_p]:
                temp=height[first_p]*count_list
                count_list-=1
                first_p+=1
            else:
                temp=height[second_p]*count_list
                count_list-=1
                second_p-=1
            if temp>w_max:
                w_max=temp
        return w_max