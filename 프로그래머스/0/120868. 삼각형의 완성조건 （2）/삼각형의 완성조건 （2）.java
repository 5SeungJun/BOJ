class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int maxSide = Math.max(sides[0], sides[1]);
        int minSide = Math.min(sides[0], sides[1]);

        for(int i = 1; i <= maxSide; i++){
            if(minSide + i > maxSide){
                answer++;
            }
        }
        for(int i = maxSide+1; i < minSide+maxSide; i++){
            answer++;
        }
        return answer;
    }
}