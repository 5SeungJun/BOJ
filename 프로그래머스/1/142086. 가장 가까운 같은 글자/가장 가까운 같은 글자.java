import java.util.HashMap;
class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> temp = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            Integer lastIndex = temp.putIfAbsent(c, i);

            if (lastIndex == null) {
                answer[i] = -1;
            } else {
                answer[i] = i - lastIndex;
                temp.put(c, i);
            }
        }
        return answer;
    }
}