import java.util.*;
class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> arr = new TreeSet<>();
        int range = numbers.length;
        
        for(int i = 0; i < range; i++){
            for(int j = i+1; j < range; j++){
                arr.add(numbers[i]+numbers[j]);
            }
        }
        
        int [] answer = new int [arr.size()];
        int idx = 0;
        for(Integer i : arr){
            answer[idx++] = i; 
        }
        
        return answer;
    }
}