class Solution {
    public String solution(String s) {
        String answer = "";
        int length = s.length();
        int mid = length/2;
        if(length % 2 == 0){
            answer = s.substring(mid-1, mid+1);
        }
        else{
            answer = s.charAt(mid)+"";
        }
        return answer;
    }
}