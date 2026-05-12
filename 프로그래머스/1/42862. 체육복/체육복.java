import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        boolean [] isReserved = new boolean [n+1];
        boolean [] isLost = new boolean[n+1];
        for(int i : reserve){
            isReserved[i] = true;
        }
        for(int i : lost){
            isLost[i] = true;
        }
        
        for(int i = 1; i <= n; i++){
            if(isReserved[i] && isLost[i]){
                isReserved[i] = false;
                isLost[i] = false;
            }
        }
        
        for(boolean b : isLost){
            if(b) answer--;
        }
        
        for(int i = 1; i <= n; i++){
            if(!isLost[i]) continue;
            
            if(i > 1 && isReserved[i-1]){
                isReserved[i-1] = false;
                isLost[i] = false;
                answer++;
            }
            else if(i < n && isReserved[i+1]){
                isReserved[i+1] = false;
                isLost[i] = false;
                answer++;
            }
        }
        return answer;
    }
}