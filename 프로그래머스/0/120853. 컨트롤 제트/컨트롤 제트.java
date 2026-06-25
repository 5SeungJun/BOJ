class Solution {
    public int solution(String s) {
        int answer = 0;
        String [] temp = s.split(" ");
        for(int i = 0; i < temp.length; i++){
            if(temp[i].equals("Z")){
                answer -= Integer.parseInt(temp[i-1]);
            }
            else answer += Integer.parseInt(temp[i]);
        }
        return answer;
    }
}