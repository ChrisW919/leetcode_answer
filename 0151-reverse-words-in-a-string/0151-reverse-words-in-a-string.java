import java.util.Collections;

class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] temp= s.split("\\s+");
        int arrCount=temp.length;
        StringBuilder sb=new StringBuilder(50);
        for(int i=arrCount-1;i>=0;i--){
            sb.append(temp[i]);
            if(i!=0){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}