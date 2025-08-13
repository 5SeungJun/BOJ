import java.io.*;
import java.util.*;

public class Solve1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //문자열 길이별로 나열하기
        Map<Integer, Set<String>> map = new TreeMap<>();
        List<String> wordList = new ArrayList<>();

        int testCase = Integer.parseInt(br.readLine());

        for (int i = 0; i < testCase; i++) {
            String input = br.readLine();
            int length = input.length();

            map.putIfAbsent(length, new TreeSet<>());
            map.get(length).add(input);
        }
        for (int key : map.keySet()) {
            for (String word : map.get(key)) {
                System.out.println(word);
            }
        }
    }
}
