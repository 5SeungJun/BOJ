package src.programmers;
import java.util.HashMap;
public class Ps42576 {
    public String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String i : participant){
            map.put(i, map.getOrDefault(i, 0) + 1); //참여 명단에 이름(key) 나온만큼 value 증가
        }
        for(String i : completion){
            map.put(i, map.get(i) - 1); //완주자 명단에 나온 이름 제거
        }
        for(String key : map.keySet()){
            if(map.get(key) > 0){
                return key;
            }
        }
        return "";
    }
}
