import java.util.*;
class Solution {
    public long solution(long n) {
        double temp = Math.sqrt(n);
        if(n != 1 && temp % 1 != 0) return -1;
        long answer = (long)Math.pow(temp+1, 2);
        return answer;
    }
}