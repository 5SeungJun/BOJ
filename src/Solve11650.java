import java.io.*;
import java.util.*;
public class Solve11650 {
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        //좌표를 저장할 map
        Map<Integer, ArrayList<Integer>> m = new HashMap<>();

        //탐색할 x 값들을 저장할 set. TreeSet은 자동 정렬, 중복 허용 X
        Set<Integer> tempX = new TreeSet<>();

        //testCase만큼 좌표를 입력받음.
        for(int i = 0; i < testCase; i++){
            String [] input = br.readLine().split(" ");
            int x = Integer.parseInt(input[0]);
            int y = Integer.parseInt(input[1]);
            //x 값을 TreeSet인 tempX에 저장함.(중복 X, 자동 정렬)
            tempX.add(x);
            //이미 입력된 x 값이면 ArrayList에 value 저장
            if(m.containsKey(x)){
                m.get(x).add(y);
                continue;
            }
            //처음 입력된 x값이면, x에 대응하는 새로운 ArrayList 생성 후, value 저장
            else{
                m.put(x, new ArrayList<>());
                m.get(x).add(y);
            }
        }
        //탐색할 x 값에 따른 y값을 정렬
        for(int i : tempX){
            Collections.sort(m.get(i));
            //x값을 가장 작은 값부터, 그에 대응하는 y값을 모두 출력한다.
            for(int j : m.get(i)){
                System.out.println(i + " " + j);
            }
        }
    }
}
