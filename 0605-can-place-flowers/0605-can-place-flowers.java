class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean flag= true;
        int f_l = flowerbed.length;
        for(int count=0;count<f_l;count++){
            if(flag && flowerbed[count]==0){
                try{
                    if(flowerbed[count+1]==0){
                        n--;
                        flag=false;
                    }
            }catch(Exception e){
                        if(flag){
                            n--;
                        }
                    }
            }else{
                if(flowerbed[count]==1){
                    flag=false;
                }else{
                    flag=true;
                }
            }
        }
        if(n<=0){
            return true;
        }else{return false;}
    }
}