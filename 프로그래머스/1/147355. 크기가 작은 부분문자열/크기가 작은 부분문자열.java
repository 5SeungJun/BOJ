class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        int targetLength = p.length();
        long target = Long.parseLong(p);

        for (int i = 0; i <= t.length() - targetLength; i++) {
            String temp = t.substring(i, i + targetLength);
            long num = Long.parseLong(temp);

            if (num <= target) {
                answer++;
            }
        }

        return answer;
    }
}