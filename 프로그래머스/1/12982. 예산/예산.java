import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        
        int idx = 0;
        while(idx < d.length && d[idx] <= budget){
            budget -= d[idx++];
        }
        return idx;
    }
    
}