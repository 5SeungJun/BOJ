import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int [] answer = {-1};
            return answer;
        }
        int [] temp = new int [arr.length];
        for(int i = 0; i < arr.length; i++){
            temp[i] = arr[i];
        }
        Arrays.sort(temp);
        
        int min = temp[0];
        ArrayList<Integer> tempArr = new ArrayList<>();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == min) continue;
            tempArr.add(arr[i]);
        }
        int [] answer = new int [tempArr.size()];
        for(int i = 0; i < tempArr.size(); i++){
            answer[i] = tempArr.get(i);
        }
        return answer;
    }
}