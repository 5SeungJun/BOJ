import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) {
            map.put(players[i], i);
        }

        for (String calling : callings) {
            int currentRank = map.get(calling);
            String frontPlayer = players[currentRank - 1];

            players[currentRank - 1] = calling;
            players[currentRank] = frontPlayer;

            map.put(calling, currentRank - 1);
            map.put(frontPlayer, currentRank);
        }
        return players;
    }
}