import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        //int answer = 0;
        int high = Math.max(sizes[0][0],sizes[0][1]); //긴 것중에 가장 긴것 저장
        int low = Math.min(sizes[0][0],sizes[0][1]); //짧은 것 중 가장 긴것 저장
        for(int i = 0; i < sizes.length; i++){
            int newHigh = Math.max(sizes[i][0], sizes[i][1]);
            int newLow = Math.min(sizes[i][0], sizes[i][1]);
            
            high = Math.max(newHigh, high);
            low = Math.max(newLow, low);
        }
        return high*low;
    }
}