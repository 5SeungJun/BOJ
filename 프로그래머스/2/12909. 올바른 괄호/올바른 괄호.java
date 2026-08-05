class Solution {
    boolean solution(String s) {
        int idx = -1;
        char [] temp = new char [s.length()];
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '('){
                temp[++idx] = '('; //temp[0]  =( 
            }
            else if(idx > -1 && c == ')' && temp[idx]=='('){
                idx--; //idx = -1 
            }
            else return false;
        }
        if(idx == -1) return true;
        else return false;
    }
}