class Solution {
    public boolean isSubsequence(String s, String t) {
        int count=0;
        int s_len=s.length();
        try{
            char temp=s.charAt(0);
        }catch(IndexOutOfBoundsException e){
            return true;
        }
        for(int i=0;i<t.length();i++){
            if(t.charAt(i)==s.charAt(count)){
                count++;
            }
            if(count==s_len){
                return true;
            }
        }
        return false;
    }
}