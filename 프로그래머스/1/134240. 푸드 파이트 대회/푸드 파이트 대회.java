class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < food.length; i++){
            for(int j = 0; j < food[i]/2; j++){
                sb.append(i);
            }
        }
        sb.append(0);
        StringBuilder s1 = new StringBuilder(sb.substring(0, sb.length()-1));
        s1.reverse();
        sb.append(s1);
        return sb.toString();
    }
}