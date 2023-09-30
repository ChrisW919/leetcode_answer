import java.lang.Math;

class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int s_p=k;
        int num_len=nums.length;
        double total=nums[0];
        for(int i=1;i<k;i++){
            total+=nums[i];
        }
        double max_val=total;
        for(int j=k;j<num_len;j++){
            total-=nums[j-k];
            total+=nums[j];
            if(total>max_val){
                max_val=total;
            }
        }
        return Math.round((max_val/k) * 1e5) / 1e5;
    }
}