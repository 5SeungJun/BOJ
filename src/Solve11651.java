package src;
import java.io.*;
import java.util.*;
public class Solve11651 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        Map<Integer, List<Integer>> temp = new TreeMap<>(); //key : y좌표, value : x좌표
        List<Integer> y = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String[] input = br.readLine().split(" ");

            if (temp.get(Integer.parseInt(input[1])) != null) {
                temp.get(Integer.parseInt(input[1])).add(Integer.parseInt(input[0]));

            } else {
                List<Integer> list = new ArrayList<>();
                list.add(Integer.parseInt(input[0]));
                temp.putIfAbsent(Integer.parseInt(input[1]), list);
            }
        }
        for(Map.Entry<Integer, List<Integer>> entry : temp.entrySet()){
            Collections.sort(entry.getValue());
            for(int x : entry.getValue()){
                bw.write(x + " " + entry.getKey() + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
