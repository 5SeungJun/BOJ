import java.io.*;
import java.util.*;

public class Solve2750 {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int testCase = Integer.parseInt(br.readLine()); //시행횟수
        ArrayList<Integer> arr = new ArrayList<>(); //입력된 숫자들을 저장할 list

        for (int i = 0; i < testCase; i++) {
            arr.add(Integer.parseInt(br.readLine())); //int형으로 변환후, list에 값 저장.
        }

        Collections.sort(arr); //컬렉션 객체인 arr List를 정렬(오름차순이 디폴트)

        for(int i : arr){ //arr List의 값 출력 대기
            bw.write(i +"\n");
        }
        bw.flush(); //출력
        bw.close();
    }
}
