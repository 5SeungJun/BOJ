import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        int recentNum = -1;
        for(int i = 0; i < arr.length; i++){
            int target = arr[i];
            if(recentNum != target){
                recentNum = target;
                temp.add(target);
            }
        }
        int [] answer = new int [temp.size()];
        for(int i = 0; i < temp.size(); i++){
            answer[i] = temp.get(i);
        }
        return answer;
    }
}