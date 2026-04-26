import java.util.*;
class Solution {
    public ArrayList solution(int[] answers) {
        int[] temp = {0,0,0};
        ArrayList <Integer> answer = new ArrayList<>();
        int [] first = {1,2,3,4,5};
        int [] second = {2,1,2,3,2,4,2,5};
        int [] third = {3,3,1,1,2,2,4,4,5,5};
        int length = answers.length;
        for(int i = 0; i < length; i++){
            if(answers[i] == first[i%first.length]) temp[0]++;
            if(answers[i] == second[i%second.length]) temp[1]++;
            if(answers[i] == third[i%third.length]) temp[2]++;
        }
        int max = Math.max(temp[0],Math.max(temp[1],temp[2]));
        for(int i = 0; i < 3; i++){
            if(temp[i] == max) answer.add(i+1);
        }
        return answer;
    }
}