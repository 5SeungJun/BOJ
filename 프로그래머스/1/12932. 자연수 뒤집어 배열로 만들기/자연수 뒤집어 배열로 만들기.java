import java.util.*;
class Solution {
    public int[] solution(long n) {
        String temp = String.valueOf(n);
        char[] c = temp.toCharArray();
        int[] answer = new int[c.length];
        
        for(int i = 0; i < c.length; i++){
            answer[i] = (int)c[c.length-i-1] - '0';
        }
        return answer;
    }
}