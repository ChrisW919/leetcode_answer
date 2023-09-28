import java.util.Arrays;

class Solution {
    public void moveZeroes(int[] nums) {
        int num_len=nums.length;
        int k=0;
        int[] new_nums=new int[num_len];
        Arrays.fill(new_nums, 0);
        for(int i=0;i<num_len;i++){
            if(nums[i]!=0){
                new_nums[k]=nums[i];
                k++;
            }
        }
        System.arraycopy(new_nums, 0, nums, 0, num_len);
    }
}