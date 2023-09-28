import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int num_len=nums.length;
        int left=0;
        int temp;
        for(int i=0;i<num_len;i++){
            if(nums[i]!=0){
                temp=nums[left];
                nums[left]=nums[i];
                nums[i]=temp;
                left++;
            }
        }
    }
}