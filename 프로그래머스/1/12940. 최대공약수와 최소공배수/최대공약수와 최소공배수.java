class Solution {
    public int[] solution(int n, int m) {
        int smaller = Math.min(n, m);
        int bigger = Math.max(n, m);
        
        while(smaller != 0){ //최대공약수 구하기
            int r = bigger % smaller;
            bigger = smaller;
            smaller = r;
        }
        int tempMax = bigger;
        
        int [] answer = {tempMax, n*m/tempMax};
        return answer;
    }
}