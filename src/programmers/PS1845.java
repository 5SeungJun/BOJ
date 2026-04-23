package src.programmers;
import java.util.HashMap;

public class PS1845 {
    public int solution(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        int maxCount = nums.length / 2;
        int count = 0;
        for (int i : map.keySet()) {
            count++;
        }
        if (maxCount < count) {
            return maxCount;
        } else return count;
    }
}
