import java.util.*;
class Solution {
    public long solution(long n) {
        
        String s = String.valueOf(n);
        char [] temp = new char[s.length()];
        for(int i = 0; i < s.length(); i++){
            temp[i] = s.charAt(i);
        }
        StringBuffer sb = new StringBuffer();
        Arrays.sort(temp);
        for(int i = temp.length-1; i >= 0; i--){
            sb.append(temp[i]+"");
        }
        return Long.valueOf(sb.toString());
    }
}