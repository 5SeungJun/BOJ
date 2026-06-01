class Solution {
    boolean solution(String s) {
        boolean answer = true;
        String temp = s.toLowerCase();
        String replaceP = temp.replace("p", "");
        String replaceY = temp.replace("y", "");
        if(replaceP.length() == replaceY.length()) answer = true;
        else answer = false;

        return answer;
    }
}