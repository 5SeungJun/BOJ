import java.util.StringTokenizer;
class Solution {
    public String solution(String s) {
        StringTokenizer st = new StringTokenizer(s);
        int min = 2147483647;
        int max = -2147483647;
        
        while(st.hasMoreTokens()){
            int num = Integer.parseInt(st.nextToken());
            min = Math.min(num, min);
            max = Math.max(num, max);
        }
        return min + " " + max;
    }
}