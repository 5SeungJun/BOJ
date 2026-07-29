class Solution {
    public String solution(String s, int n) {
    StringBuilder sb = new StringBuilder("");
    for(int i = 0; i < s.length(); i++){
        char c = s.charAt(i);
        if(c == ' '){
            sb.append(c);
        }
        else if(c >= 'a' && c <= 'z'){
            char ascii = (char)((c-'a' + n) % 26 + 'a');
            sb.append(ascii);
        }
        else{
            char ascii = (char)((c-'A' + n) % 26 + 'A');
            sb.append(ascii);
        }
        
    }
        return sb.toString();
    }
}

