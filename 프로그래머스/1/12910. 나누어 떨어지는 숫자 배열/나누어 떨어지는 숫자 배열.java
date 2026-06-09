import java.util.*;
class Solution {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int a : arr){
            if(a%divisor == 0) list.add(a);
        }
        if(list.size() < 1){
            int [] answer = {-1};
            return answer;
        }
        int [] answer = new int[list.size()];
        for(int i = 0; i < list.size(); i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}