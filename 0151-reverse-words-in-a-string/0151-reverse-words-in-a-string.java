import java.util.Collections;

class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String[] temp= s.split("\\s+");
        int arrCount=temp.length;
        Collections.reverse(Arrays.asList(temp));
        StringBuilder sb=new StringBuilder(50);
        for(int i=0;i<arrCount;i++){
            sb.append(temp[i]);
            if(i!=arrCount-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}