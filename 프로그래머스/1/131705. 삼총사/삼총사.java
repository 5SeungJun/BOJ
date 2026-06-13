class Solution {
    public int solution(int[] number) {
        int answer = 0;
        for(int i = 0; i < number.length; i++){
            int first =  number[i];
            for(int j = i+1; j < number.length; j++){
                int second = number[j];
                for(int k = j+1; k < number.length; k++){
                    if(first + second + number[k] == 0) answer++; 
                }
            }
        }
        return answer;
    }
}