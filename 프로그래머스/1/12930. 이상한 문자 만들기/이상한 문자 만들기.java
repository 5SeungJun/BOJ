class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int index = 0;
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == ' '){
                index = 0;
                sb.append(c);
                continue;
            }
            if(index % 2 == 0) sb.append(Character.toUpperCase(c));
            else sb.append(Character.toLowerCase(c));
            index++;
        }
        return sb.toString();
    }
}